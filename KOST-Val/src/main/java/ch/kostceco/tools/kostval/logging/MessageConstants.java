/*== KOST-Val ==================================================================================
The KOST-Val application is used for validate TIFF, SIARD, PDF/A-Files and Submission 
Information Package (SIP). 
Copyright (C) 2012-2014 Claire Röthlisberger (KOST-CECO), Christian Eugster, Olivier Debenath, 
Peter Schneider (Staatsarchiv Aargau), Daniel Ludin (BEDAG AG)
-----------------------------------------------------------------------------------------------
KOST-Val is a development of the KOST-CECO. All rights rest with the KOST-CECO. 
This application is free software: you can redistribute it and/or modify it under the 
terms of the GNU General Public License as published by the Free Software Foundation, 
either version 3 of the License, or (at your option) any later version. 
BEDAG AG and Daniel Ludin hereby disclaims all copyright interest in the program 
SIP-Val v0.2.0 written by Daniel Ludin (BEDAG AG). Switzerland, 1 March 2011.
This application is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
See the follow GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program; 
if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, 
Boston, MA 02110-1301 USA or see <http://www.gnu.org/licenses/>.
==============================================================================================*/

package ch.kostceco.tools.kostval.logging;

/**
 * Interface für den Zugriff auf Resourcen aus dem ResourceBundle.
 * 
 * @author Rc Claire Röthlisberger, KOST-CECO
 */
public interface MessageConstants
{

	// Initialisierung und Parameter-Ueberpruefung
	String	ERROR_IOE									= "error.ioe";
	String	ERROR_PARAMETER_USAGE						= "error.parameter.usage";
	String	ERROR_LOGDIRECTORY_NODIRECTORY				= "error.logdirectory.nodirectory";
	String	ERROR_LOGDIRECTORY_NOTWRITABLE				= "error.logdirectory.notwritable";
	String	ERROR_WORKDIRECTORY_NOTDELETABLE			= "error.workdirectory.notdeletable";
	String	ERROR_WORKDIRECTORY_NOTWRITABLE				= "error.workdirectory.notwritable";
	String	ERROR_WORKDIRECTORY_EXISTS					= "error.workdirectory.exists";
	String	ERROR_VALFILE_FILENOTEXISTING				= "error.valfile.filenotexisting";
	String	ERROR_LOGGING_NOFILEAPPENDER				= "error.logging.nofileappender";
	String	ERROR_CANNOTCREATEZIP						= "error.cannotcreatezip";
	String	ERROR_JHOVECONF_MISSING						= "error.jhoveconf.missing";
	String	ERROR_PARAMETER_OPTIONAL_1					= "error.parameter.optional.1";
	String	ERROR_INCORRECTFILEENDING					= "error.incorrectfileending";
	String	ERROR_INCORRECTFILEENDINGS					= "error.incorrectfileendings";
	String	ERROR_WRONG_JRE								= "error.wrong.jdk";

	// Globale Meldungen
	String	MESSAGE_XML_SUMMARY_3C						= "message.xml.summary.3c";
	String	MESSAGE_XML_VALFILE							= "message.xml.valfile";
	String	MESSAGE_XML_HEADER							= "message.xml.header";
	String	MESSAGE_XML_START							= "message.xml.start";
	String	MESSAGE_XML_END								= "message.xml.end";
	String	MESSAGE_XML_INFO							= "message.xml.info";
	String	MESSAGE_TIFFVALIDATION						= "message.tiffvalidation";
	String	MESSAGE_SIARDVALIDATION						= "message.siardvalidation";
	String	MESSAGE_PDFAVALIDATION						= "message.pdfavalidation";
	String	MESSAGE_SIPVALIDATION						= "message.sipvalidation";
	String	MESSAGE_XML_VALERGEBNIS						= "message.xml.valergebnis";
	String	MESSAGE_XML_VALTYPE							= "message.xml.valtype";
	String	MESSAGE_XML_FORMAT1							= "message.xml.format1";
	String	MESSAGE_XML_FORMAT2							= "message.xml.format2";
	String	MESSAGE_XML_LOGEND							= "message.xml.logend";
	String	MESSAGE_XML_SIP1							= "message.xml.sip1";
	String	MESSAGE_XML_SIP2							= "message.xml.sip2";
	String	MESSAGE_XML_VALERGEBNIS_VALID				= "message.xml.valergebnis.valid";
	String	MESSAGE_XML_VALERGEBNIS_INVALID				= "message.xml.valergebnis.invalid";
	String	MESSAGE_XML_VALERGEBNIS_CLOSE				= "message.xml.valergebnis.close";

	String	MESSAGE_XML_MODUL_A_TIFF					= "message.xml.modul.a.tiff";
	String	MESSAGE_XML_MODUL_B_TIFF					= "message.xml.modul.b.tiff";
	String	MESSAGE_XML_MODUL_C_TIFF					= "message.xml.modul.c.tiff";
	String	MESSAGE_XML_MODUL_D_TIFF					= "message.xml.modul.d.tiff";
	String	MESSAGE_XML_MODUL_E_TIFF					= "message.xml.modul.e.tiff";
	String	MESSAGE_XML_MODUL_F_TIFF					= "message.xml.modul.f.tiff";
	String	MESSAGE_XML_MODUL_G_TIFF					= "message.xml.modul.g.tiff";
	String	MESSAGE_XML_MODUL_H_TIFF					= "message.xml.modul.h.tiff";

	String	MESSAGE_XML_MODUL_A_SIARD					= "message.xml.modul.a.siard";
	String	MESSAGE_XML_MODUL_B_SIARD					= "message.xml.modul.b.siard";
	String	MESSAGE_XML_MODUL_C_SIARD					= "message.xml.modul.c.siard";
	String	MESSAGE_XML_MODUL_D_SIARD					= "message.xml.modul.d.siard";
	String	MESSAGE_XML_MODUL_E_SIARD					= "message.xml.modul.e.siard";
	String	MESSAGE_XML_MODUL_F_SIARD					= "message.xml.modul.f.siard";
	String	MESSAGE_XML_MODUL_G_SIARD					= "message.xml.modul.g.siard";
	String	MESSAGE_XML_MODUL_H_SIARD					= "message.xml.modul.h.siard";
	String	MESSAGE_XML_MODUL_I_SIARD					= "message.xml.modul.i.siard";
	String	MESSAGE_XML_MODUL_J_SIARD					= "message.xml.modul.j.siard";

	String	MESSAGE_XML_MODUL_A_PDFA					= "message.xml.modul.a.pdfa";
	String	MESSAGE_XML_MODUL_B_PDFA					= "message.xml.modul.b.pdfa";
	String	MESSAGE_XML_MODUL_C_PDFA					= "message.xml.modul.c.pdfa";
	String	MESSAGE_XML_MODUL_D_PDFA					= "message.xml.modul.d.pdfa";
	String	MESSAGE_XML_MODUL_E_PDFA					= "message.xml.modul.e.pdfa";
	String	MESSAGE_XML_MODUL_F_PDFA					= "message.xml.modul.f.pdfa";
	String	MESSAGE_XML_MODUL_G_PDFA					= "message.xml.modul.g.pdfa";
	String	MESSAGE_XML_MODUL_H_PDFA					= "message.xml.modul.h.pdfa";
	String	MESSAGE_XML_MODUL_I_PDFA					= "message.xml.modul.i.pdfa";
	String	MESSAGE_XML_MODUL_J_PDFA					= "message.xml.modul.j.pdfa";

	String	MESSAGE_XML_MODUL_Aa_SIP					= "message.xml.modul.aa.sip";
	String	MESSAGE_XML_MODUL_Ab_SIP					= "message.xml.modul.ab.sip";
	String	MESSAGE_XML_MODUL_Ac_SIP					= "message.xml.modul.ac.sip";
	String	MESSAGE_XML_MODUL_Ad_SIP					= "message.xml.modul.ad.sip";
	String	MESSAGE_XML_MODUL_Ae_SIP					= "message.xml.modul.ae.sip";
	String	MESSAGE_XML_MODUL_Af_SIP					= "message.xml.modul.af.sip";
	String	MESSAGE_XML_MODUL_Ba_SIP					= "message.xml.modul.ba.sip";
	String	MESSAGE_XML_MODUL_Bb_SIP					= "message.xml.modul.bb.sip";
	String	MESSAGE_XML_MODUL_Bc_SIP					= "message.xml.modul.bc.sip";
	String	MESSAGE_XML_MODUL_Bd_SIP					= "message.xml.modul.bd.sip";
	String	MESSAGE_XML_MODUL_Ca_SIP					= "message.xml.modul.ca.sip";
	String	MESSAGE_XML_MODUL_Cb_SIP					= "message.xml.modul.cb.sip";
	String	MESSAGE_XML_MODUL_Cc_SIP					= "message.xml.modul.cc.sip";
	String	MESSAGE_XML_MODUL_Cd_SIP					= "message.xml.modul.cd.sip";

	String	MESSAGE_XML_CONFIGURATION_ERROR_1				= "message.xml.configuration.error.1";
	String	MESSAGE_XML_CONFIGURATION_ERROR_2				= "message.xml.configuration.error.2";
	String	MESSAGE_XML_CONFIGURATION_ERROR_3				= "message.xml.configuration.error.3";

	String	MESSAGE_XML_CONFIGURATION_ERROR_NO_SIGNATURE	= "message.xml.configuration.error.no.signature";
	String	ERROR_XML_CANNOT_INITIALIZE_DROID				= "error.xml.cannot.initialize.droid";

	String	ERROR_XML_UNKNOWN							= "error.xml.unknown";

	// *************TIFF-Meldungen*************************************************************************
	// Modul A Meldungen
	String	ERROR_XML_A_INCORRECTFILEENDING				= "error.xml.a.incorrectfileending";
	String	ERROR_XML_A_INCORRECTFILE					= "error.xml.a.incorrectfile";
	String	ERROR_XML_A_ISDIRECTORY						= "error.xml.a.isdirectory";

	// Modul B Meldungen
	String	MESSAGE_XML_B_CANNOTWRITEJHOVEREPORT		= "message.xml.b.cannotwritejhovereport";
	String	MESSAGE_XML_B_JHOVEINVALID					= "message.xml.b.jhoveinvalid";
	String	MESSAGE_XML_B_JHOVEMESSAGE					= "message.xml.b.jhovemessage";

	// Modul C-G Meldungen
	String	MESSAGE_XML_CG_CANNOTFINDJHOVEREPORT		= "message.xml.cg.cannotfindjhovereport";
	String	MESSAGE_XML_CG_INVALID						= "message.xml.cg.invalid";
	String	MESSAGE_XML_CG_JHOVENIO						= "message.xml.cg.jhovenio";

	// *************SIARD-Meldungen*************************************************************************
	// Modul A Meldungen
	String	ERROR_XML_A_NOFILE							= "error.xml.a.nofile";
	String	ERROR_XML_A_INCORRECTFILEENDING_SIARD		= "error.xml.a.incorrectfileending.siard";
	String	ERROR_XML_A_DEFLATED						= "error.xml.a.deflated";

	// Modul B Meldungen
	String	MESSAGE_XML_B_NOTALLOWEDFILE				= "message.xml.b.notallowedfile";
	String	MESSAGE_XML_B_CONTENT						= "message.xml.b.content";
	String	MESSAGE_XML_B_HEADER						= "message.xml.b.header";

	// Modul C Meldungen
	String	MESSAGE_XML_C_NOMETADATAFOUND				= "message.xml.c.nometadatafound";
	String	MESSAGE_XML_C_NOMETADATAXSD					= "message.xml.c.nometadataxsd";
	String	MESSAGE_XML_C_METADATA_ERRORS				= "message.xml.c.metadata.errors";
	String	MESSAGE_XML_C_METADATA_ORIGERRORS			= "message.xml.c.metadata.origerrors";

	// Modul D Meldungen
	String	MESSAGE_XML_D_INVALID_FOLDER				= "message.xml.d.invalid.folder";
	String	MESSAGE_XML_D_MISSING_FOLDER				= "message.xml.d.missing.folder";
	String	MESSAGE_XML_D_INVALID_FILE					= "message.xml.d.invalid.file";
	String	MESSAGE_XML_D_MISSING_FILE					= "message.xml.d.missing.file";

	// Modul E Meldungen
	String	MESSAGE_XML_E_PROPERTIES_ERROR				= "message.xml.e.properties.error";
	String	MESSAGE_XML_E_PATH_ERROR					= "message.xml.e.path.error";
	String	MESSAGE_XML_E_EXTRACT_ERROR					= "message.xml.e.extract.error";
	String	MESSAGE_XML_E_METADATA_ACCESS_ERROR			= "message.xml.e.metadata.access.error";
	String	MESSAGE_XML_E_XML_ACCESS_ERROR				= "message.xml.e.xml.access.error";
	String	MESSAGE_XML_E_PREVALIDATION_ERROR			= "message.xml.e.prevalidation.error";
	String	MESSAGE_XML_E_INVALID_ATTRIBUTE_COUNT		= "message.xml.e.attribute.count.validation.failed";
	String	MESSAGE_XML_E_INVALID_ATTRIBUTE_OCCURRENCE	= "message.xml.e.attribute.occurrence.validation.failed";
	String	MESSAGE_XML_E_INVALID_ATTRIBUTE_TYPE		= "message.xml.e.attribute.type.validation.failed";

	// Modul F Meldungen
	String	MESSAGE_XML_F_PROPERTIES_ERROR				= "message.xml.f.properties.error";
	String	MESSAGE_XML_F_PATH_ERROR					= "message.xml.f.path.error";
	String	MESSAGE_XML_F_INVALID_TABLE_XML_FILES		= "message.xml.f.invalid.table.xml.files";
	String	MESSAGE_XML_F_INVALID_TABLE_XSD_FILES		= "message.xml.f.invalid.table.xsd.files";

	// Modul G Meldungen
	String	MESSAGE_XML_G_DUPLICATE_SCHEMA				= "message.xml.g.duplicate.schema";
	String	MESSAGE_XML_G_DUPLICATE_TABLE				= "message.xml.g.duplicate.table";
	String	MESSAGE_XML_G_DUPLICATE_COLUMN				= "message.xml.g.duplicate.column";

	// Modul H Meldungen
	String	MESSAGE_XML_H_INVALID_FOLDER				= "message.xml.h.invalid.folder";
	String	MESSAGE_XML_H_INVALID_XML					= "message.xml.h.invalid.xml";
	String	MESSAGE_XML_H_INVALID_ERROR					= "message.xml.h.invalid.error";
	String	MESSAGE_XML_H_TABLE_NOT_VALIDATED1			= "message.xml.h.table.not.validated1";
	String	MESSAGE_XML_H_TABLE_NOT_VALIDATED2			= "message.xml.h.table.not.validated2";

	// Modul I Meldungen
	String	MESSAGE_XML_I_NOTALLOWEDEXT					= "message.xml.i.notallowedext";

	// Modul J Meldungen
	String	MESSAGE_XML_J_INVALID_FOLDER				= "message.xml.j.invalid.folder";
	String	MESSAGE_XML_J_INVALID_FILE					= "message.xml.j.invalid.file";
	String	MESSAGE_XML_J_INVALID_ENTRY					= "message.xml.j.invalid.entry";

	// *************PDFA-Meldungen*************************************************************************
	// Modul A Meldungen
	String	ERROR_XML_A_PDFA_INCORRECTFILEENDING		= "error.xml.a.pdfa.incorrectfileending";
	String	ERROR_XML_A_PDFA_INCORRECTFILE				= "error.xml.a.pdfa.incorrectfile";
	String	ERROR_XML_A_PDFA_ISDIRECTORY				= "error.xml.a.pdfa.isdirectory";
	String	ERROR_XML_A_PDFA_SERVICEFAILED				= "error.xml.a.pdfa.servicefailed";
	String	ERROR_XML_PDFTRON_MISSING					= "error.xml.pdftron.missing";
	String	ERROR_XML_A_PDFA_INIT						= "error.xml.a.pdfa.init";
	String	ERROR_XML_A_PDFA_NOCONFIG					= "error.xml.a.pdfa.noconfig";

	String	ERROR_XML_AJ_PDFA_ERRORMESSAGE				= "error.xml.aj.pdfa.errormessage";

	// *************SIP-Meldungen*************************************************************************
	// Modul 1a Meldungen
	String	ERROR_XML_AA_INCORRECTFILEENDING			= "error.xml.aa.incorrectfileending";
	String	ERROR_XML_AA_CANNOTEXTRACTZIP				= "error.xml.aa.cannotextractzip";

	// Modul 1b Meldungen
	String	ERROR_XML_AB_CONTENT						= "error.xml.ab.content";
	String	ERROR_XML_AB_XSD							= "error.xml.ab.xsd";
	String	ERROR_XML_AB_METADATA						= "error.xml.ab.metadata";

	// Modul 1c Meldungen
	String	MESSAGE_XML_AC_NOTALLOWEDFILE				= "message.xml.ac.notallowedfile";
	String	MESSAGE_XML_AC_NOTALLOWEDV					= "message.xml.ac.notallowedv";
	String	MESSAGE_XML_AC_MISSINGFILE					= "message.xml.ac.missingfile";
	String	MESSAGE_XML_AC_PATHTOOLONG					= "message.xml.ac.pathtoolong";
	String	MESSAGE_XML_AC_FILENAMETOOLONG				= "message.xml.ac.filenametoolong";
	String	MESSAGE_XML_AC_INVALIDCHARACTERS			= "message.xml.ac.invalidcharacters";
	String	MESSAGE_XML_AC_INVALIDREGEX					= "message.xml.ac.invalidregex";
	String	MESSAGE_XML_AC_INVALIDFILENAME				= "message.xml.ac.invalidfilename";

	// Modul 1d Meldungen
	String	ERROR_XML_AD_WRONGNUMBEROFXSDS				= "error.xml.ad.wrongnumberofxsds";
	String	ERROR_XML_AD_CONTENTB4HEADER				= "error.xml.ad.contentB4header";
	String	ERROR_XML_AD_METADATA_ERRORS				= "error.xml.ad.metadata.errors";

	// Modul 1e Meldungen
	String	ERROR_XML_AE_NOMETADATAFOUND				= "error.xml.ae.nometadatafound";
	String	ERROR_XML_AE_ABLIEFERUNGSTYPUNDEFINED		= "error.xml.ae.ablieferungstypundefined";

	// Modul 1f Meldungen
	String	ERROR_XML_AF_FILESIPWITHOUTPRIMARYDATA		= "error.xml.af.filesipwithoutprimarydata";

	// Modul 2a Meldungen
	String	MESSAGE_XML_BA_FILEMISSING					= "message.xml.ba.filemissing";

	// Modul 2b Meldungen
	String	ERROR_XML_BB_CANNOTPROCESSMD5				= "error.xml.bb.cannotprocessmd5";
	String	ERROR_XML_BB_CANNOTCLOSESTREAMMD5			= "error.xml.bb.cannotclosestreammd5";
	String	MESSAGE_XML_Bb_WRONGMD5						= "error.xml.bb.wrongmd5";

	// Modul 2c Meldungen
	String	MESSAGE_XML_BC_FILEMISSING					= "message.xml.bc.filemissing";
	String	MESSAGE_XML_BC_FILEMISSINGO					= "message.xml.bc.filemissingo";

	// Modul 2d Meldungen
	String	MESSAGE_XML_BD_MISSINGINABLIEFERUNG			= "message.xml.bd.missinginablieferung";

	// Modul 3a Meldungen
	String	MESSAGE_XML_CA_FILES						= "message.xml.ca.files";
	String	MESSAGE_XML_CA_DROID						= "message.xml.ca.droid";

	// Modul 3b Meldungen
	String	MESSAGE_XML_CB_FORMAT						= "message.xml.cb.format";

	// Modul 3c Meldungen
	String	MESSAGE_XML_CC_INVALID						= "message.xml.cc.invalid";

	// Modul 3d Meldungen
	String	ERROR_XML_CD_DATUM_ENTSTEHUNG_IN_FUTURE		= "error.xml.cd.datum.entstehung.in.future";
	String	ERROR_XML_CD_DATUM_IN_FUTURE				= "error.xml.cd.datum.in.future";

	String	ERROR_XML_CD_INVALID_ABLIEFERUNG_RANGE		= "error.xml.cd.invalid.ablieferung.range";
	String	ERROR_XML_CD_INVALID_DOSSIER_RANGE_CA		= "error.xml.cd.invalid.dossier.range.ca";
	String	ERROR_XML_CD_INVALID_DOSSIER_RANGE_CA_ABL	= "error.xml.cd.invalid.dossier.range.ca.abl";
	String	ERROR_XML_CD_INVALID_DOKUMENT_RANGE_CA		= "error.xml.cd.invalid.dokument.range.ca";
	String	ERROR_XML_CD_UNPARSEABLE_DATE				= "error.xml.cd.unparseable.date";
}
