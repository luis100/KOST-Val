@echo off & SETLOCAL

SET _prompt=%1

REM VBS script mit einem Echo Inputbox statement:
ECHO Wscript.Echo Inputbox("S'il vous pla�t entrer un nom pour le dossier log: %_prompt%","Nom")>%TEMP%\~input.vbs

REM vbScript ausf�hren und output speichern
FOR /f "delims=/" %%G IN ('cscript //nologo %TEMP%\~input.vbs') DO set _string=%%G

REM VBS-Datei l�schen und Input speichern
DEL %TEMP%\~input.vbs
ENDLOCAL & SET _input=%_string%
SET LogOrdner=%_input%

SET _prompt=%1

REM VBS script mit einem Echo Inputbox statement:
ECHO Wscript.Echo Inputbox("S'il vous pla�t entrer le lien vers le dossier contenant les fichiers � valider ou le lien vers un fichier:%_prompt%","Lien", "C:\TEMP\TIFF")>%TEMP%\~input.vbs

REM vbScript ausf�hren und output speichern
FOR /f "delims=/" %%G IN ('cscript //nologo %TEMP%\~input.vbs') DO set _string=%%G

REM VBS-Datei l�schen und Input speichern
DEL %TEMP%\~input.vbs
ENDLOCAL & SET _input=%_string%
SET DATEIEN=%_input%

@echo off
REM Ordner "logs" anlegen
MKDIR logs\%LogOrdner%

ECHO Date de validation: %date% >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO D�but de validation: %time% >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO =========================== T I F F - V A L ===========================  >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log


REM setzen der variablen f�r die zusammenfassung der errorlevel
set g=0
REM g=gut=Datei Valid -> errorlevel=0
set h=0
REM h=hilfe=Datei-Aufruf-Fehler -> errorlevel=1
set i=0
REM i=invalid=Datei Invalid -> errorlevel=2

ECHO.
ECHO Commande pour KOST-Val: 
ECHO Java-lien   -jar   kostval.jar-lien  %DATEIEN%  logs\%LogOrdner%
ECHO.
ECHO ========================== D E M A R R A G E ==========================  
ECHO.
IF exist "%DATEIEN%\" (
    REM It's a directory
    REM --- FOR Schleife f�r die Validierung aller TIFF- & SIARD-Dateien inkl.Unterordner --- 
    FOR /R "%DATEIEN%" %%J In (*.tif *.siard) DO (
    SET Datei=%%J
    ECHO.
    Drittapplikationen\jre6\bin\java.exe -jar KOST-Val\kostval.jar "%%J" "logs\%LogOrdner%"
    CALL :sub_ord "Datei" "LogOrdner"
    ECHO.
    ECHO --------------------
    )
) ELSE (
    REM It's a file
    REM --- Fals eine Datei eingeben wurde
    Drittapplikationen\jre6\bin\java.exe -jar KOST-Val\kostval.jar "%DATEIEN%" "logs\%LogOrdner%"
    SET Datei=%DATEIEN%
    CALL :sub_ord "Datei" "LogOrdner"
)
ECHO.
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO ============================  R E S U M E =============================  >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO       Valide = %g%   Invalide = %i%   Erreur dans le demarrage = %h% >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO ================================ F I N ================================  >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO Validation termin�e: %time% >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO. >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
ECHO ============================  R E S U M E =============================  
ECHO.
ECHO       Valide = %g%   Invalide = %i%   Erreur dans le demarrage = %h%
ECHO.
ECHO ================================ F I N ================================  
ECHO.
PAUSE
EXIT /B 

REM muss via "CALL :sub_ord" erfolgen weil dies in FOR nicht funktioniert
:sub_ord
 ECHO return code %errorlevel%
 IF %errorlevel% == 0 (
  set /a g+=1
  ECHO Valide: %Datei% >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
 ) ELSE (
  IF %errorlevel% == 2 (
   set /a i+=1
   ECHO INVALIDE: %Datei% >> logs\"%LogOrdner%"\_KOST-Val-Summary.log
  ) ELSE (
   set /a h+=1
  )
 )
 GOTO :eof