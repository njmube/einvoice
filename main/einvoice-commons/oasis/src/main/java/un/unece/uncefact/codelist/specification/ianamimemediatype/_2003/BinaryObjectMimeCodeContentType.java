
package un.unece.uncefact.codelist.specification.ianamimemediatype._2003;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BinaryObjectMimeCodeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BinaryObjectMimeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="application/CSTAdata+xml"/>
 *     &lt;enumeration value="application/EDI-Consent"/>
 *     &lt;enumeration value="application/EDI-X12"/>
 *     &lt;enumeration value="application/EDIFACT"/>
 *     &lt;enumeration value="application/activemessage"/>
 *     &lt;enumeration value="application/andrew-inset"/>
 *     &lt;enumeration value="application/applefile"/>
 *     &lt;enumeration value="application/atomicmail"/>
 *     &lt;enumeration value="application/batch-SMTP"/>
 *     &lt;enumeration value="application/beep+xml"/>
 *     &lt;enumeration value="application/cals-1840"/>
 *     &lt;enumeration value="application/cnrp+xml"/>
 *     &lt;enumeration value="application/commonground"/>
 *     &lt;enumeration value="application/cpl+xml"/>
 *     &lt;enumeration value="application/csta+xml"/>
 *     &lt;enumeration value="application/cybercash"/>
 *     &lt;enumeration value="application/dca-rft"/>
 *     &lt;enumeration value="application/dec-dx"/>
 *     &lt;enumeration value="application/dialog-info+xml"/>
 *     &lt;enumeration value="application/dicom"/>
 *     &lt;enumeration value="application/dns"/>
 *     &lt;enumeration value="application/dvcs"/>
 *     &lt;enumeration value="application/epp+xml"/>
 *     &lt;enumeration value="application/eshop"/>
 *     &lt;enumeration value="application/fits"/>
 *     &lt;enumeration value="application/font-tdpfr"/>
 *     &lt;enumeration value="application/http"/>
 *     &lt;enumeration value="application/hyperstudio"/>
 *     &lt;enumeration value="application/iges"/>
 *     &lt;enumeration value="application/im-iscomposing+xml"/>
 *     &lt;enumeration value="application/index"/>
 *     &lt;enumeration value="application/index.cmd"/>
 *     &lt;enumeration value="application/index.obj"/>
 *     &lt;enumeration value="application/index.response"/>
 *     &lt;enumeration value="application/index.vnd"/>
 *     &lt;enumeration value="application/iotp"/>
 *     &lt;enumeration value="application/ipp"/>
 *     &lt;enumeration value="application/isup"/>
 *     &lt;enumeration value="application/kpml-request+xml"/>
 *     &lt;enumeration value="application/kpml-response+xml"/>
 *     &lt;enumeration value="application/mac-binhex40"/>
 *     &lt;enumeration value="application/macwriteii"/>
 *     &lt;enumeration value="application/marc"/>
 *     &lt;enumeration value="application/mathematica"/>
 *     &lt;enumeration value="application/mbox"/>
 *     &lt;enumeration value="application/mikey"/>
 *     &lt;enumeration value="application/mpeg4-generic"/>
 *     &lt;enumeration value="application/msword"/>
 *     &lt;enumeration value="application/news-message-id"/>
 *     &lt;enumeration value="application/news-transmission"/>
 *     &lt;enumeration value="application/ocsp-request"/>
 *     &lt;enumeration value="application/ocsp-response"/>
 *     &lt;enumeration value="application/octet-stream"/>
 *     &lt;enumeration value="application/oda"/>
 *     &lt;enumeration value="application/ogg"/>
 *     &lt;enumeration value="application/parityfec"/>
 *     &lt;enumeration value="application/pdf"/>
 *     &lt;enumeration value="application/pgp-encrypted"/>
 *     &lt;enumeration value="application/pgp-keys"/>
 *     &lt;enumeration value="application/pgp-signature"/>
 *     &lt;enumeration value="application/pidf+xml"/>
 *     &lt;enumeration value="application/pkcs10"/>
 *     &lt;enumeration value="application/pkcs7-mime"/>
 *     &lt;enumeration value="application/pkcs7-signature"/>
 *     &lt;enumeration value="application/pkix-cert"/>
 *     &lt;enumeration value="application/pkix-crl"/>
 *     &lt;enumeration value="application/pkix-pkipath"/>
 *     &lt;enumeration value="application/pkixcmp"/>
 *     &lt;enumeration value="application/postscript"/>
 *     &lt;enumeration value="application/prs.alvestrand.titrax-sheet"/>
 *     &lt;enumeration value="application/prs.cww"/>
 *     &lt;enumeration value="application/prs.nprend"/>
 *     &lt;enumeration value="application/prs.plucker"/>
 *     &lt;enumeration value="application/qsig"/>
 *     &lt;enumeration value="application/rdf+xml"/>
 *     &lt;enumeration value="application/reginfo+xml"/>
 *     &lt;enumeration value="application/remote-printing"/>
 *     &lt;enumeration value="application/resource-lists+xml"/>
 *     &lt;enumeration value="application/riscos"/>
 *     &lt;enumeration value="application/rls-services+xml"/>
 *     &lt;enumeration value="application/rtf"/>
 *     &lt;enumeration value="application/samlassertion+xml"/>
 *     &lt;enumeration value="application/samlmetadata+xml"/>
 *     &lt;enumeration value="application/sbml+xml"/>
 *     &lt;enumeration value="application/sdp"/>
 *     &lt;enumeration value="application/set-payment"/>
 *     &lt;enumeration value="application/set-payment-initiation"/>
 *     &lt;enumeration value="application/set-registration"/>
 *     &lt;enumeration value="application/set-registration-initiation"/>
 *     &lt;enumeration value="application/sgml"/>
 *     &lt;enumeration value="application/sgml-open-catalog"/>
 *     &lt;enumeration value="application/shf+xml"/>
 *     &lt;enumeration value="application/sieve"/>
 *     &lt;enumeration value="application/simple-filter+xml"/>
 *     &lt;enumeration value="application/simple-message-summary"/>
 *     &lt;enumeration value="application/slate"/>
 *     &lt;enumeration value="application/soap+xml"/>
 *     &lt;enumeration value="application/spirits-event+xml"/>
 *     &lt;enumeration value="application/timestamp-query"/>
 *     &lt;enumeration value="application/timestamp-reply"/>
 *     &lt;enumeration value="application/tve-trigger"/>
 *     &lt;enumeration value="application/vemmi"/>
 *     &lt;enumeration value="application/vnd.3M.Post-it-Notes"/>
 *     &lt;enumeration value="application/vnd.3gpp.pic-bw-large"/>
 *     &lt;enumeration value="application/vnd.3gpp.pic-bw-small"/>
 *     &lt;enumeration value="application/vnd.3gpp.pic-bw-var"/>
 *     &lt;enumeration value="application/vnd.3gpp.sms"/>
 *     &lt;enumeration value="application/vnd.FloGraphIt"/>
 *     &lt;enumeration value="application/vnd.Kinar"/>
 *     &lt;enumeration value="application/vnd.Mobius.DAF"/>
 *     &lt;enumeration value="application/vnd.Mobius.DIS"/>
 *     &lt;enumeration value="application/vnd.Mobius.MBK"/>
 *     &lt;enumeration value="application/vnd.Mobius.MQY"/>
 *     &lt;enumeration value="application/vnd.Mobius.MSL"/>
 *     &lt;enumeration value="application/vnd.Mobius.PLC"/>
 *     &lt;enumeration value="application/vnd.Mobius.TXF"/>
 *     &lt;enumeration value="application/vnd.Quark.QuarkXPress"/>
 *     &lt;enumeration value="application/vnd.RenLearn.rlprint"/>
 *     &lt;enumeration value="application/vnd.accpac.simply.aso"/>
 *     &lt;enumeration value="application/vnd.accpac.simply.imp"/>
 *     &lt;enumeration value="application/vnd.acucobol"/>
 *     &lt;enumeration value="application/vnd.acucorp"/>
 *     &lt;enumeration value="application/vnd.adobe.xfdf"/>
 *     &lt;enumeration value="application/vnd.aether.imp"/>
 *     &lt;enumeration value="application/vnd.amiga.ami"/>
 *     &lt;enumeration value="application/vnd.anser-web-certificate-issue-initiation"/>
 *     &lt;enumeration value="application/vnd.anser-web-funds-transfer-initiation"/>
 *     &lt;enumeration value="application/vnd.audiograph"/>
 *     &lt;enumeration value="application/vnd.blueice.multipass"/>
 *     &lt;enumeration value="application/vnd.bmi"/>
 *     &lt;enumeration value="application/vnd.businessobjects"/>
 *     &lt;enumeration value="application/vnd.canon-cpdl"/>
 *     &lt;enumeration value="application/vnd.canon-lips"/>
 *     &lt;enumeration value="application/vnd.cinderella"/>
 *     &lt;enumeration value="application/vnd.claymore"/>
 *     &lt;enumeration value="application/vnd.commerce-battelle"/>
 *     &lt;enumeration value="application/vnd.commonspace"/>
 *     &lt;enumeration value="application/vnd.contact.cmsg"/>
 *     &lt;enumeration value="application/vnd.cosmocaller"/>
 *     &lt;enumeration value="application/vnd.criticaltools.wbs+xml"/>
 *     &lt;enumeration value="application/vnd.ctc-posml"/>
 *     &lt;enumeration value="application/vnd.cups-postscript"/>
 *     &lt;enumeration value="application/vnd.cups-raster"/>
 *     &lt;enumeration value="application/vnd.cups-raw"/>
 *     &lt;enumeration value="application/vnd.curl"/>
 *     &lt;enumeration value="application/vnd.cybank"/>
 *     &lt;enumeration value="application/vnd.data-vision.rdz"/>
 *     &lt;enumeration value="application/vnd.dna"/>
 *     &lt;enumeration value="application/vnd.dpgraph"/>
 *     &lt;enumeration value="application/vnd.dreamfactory"/>
 *     &lt;enumeration value="application/vnd.dxr"/>
 *     &lt;enumeration value="application/vnd.ecdis-update"/>
 *     &lt;enumeration value="application/vnd.ecowin.chart"/>
 *     &lt;enumeration value="application/vnd.ecowin.filerequest"/>
 *     &lt;enumeration value="application/vnd.ecowin.fileupdate"/>
 *     &lt;enumeration value="application/vnd.ecowin.series"/>
 *     &lt;enumeration value="application/vnd.ecowin.seriesrequest"/>
 *     &lt;enumeration value="application/vnd.ecowin.seriesupdate"/>
 *     &lt;enumeration value="application/vnd.enliven"/>
 *     &lt;enumeration value="application/vnd.epson.esf"/>
 *     &lt;enumeration value="application/vnd.epson.msf"/>
 *     &lt;enumeration value="application/vnd.epson.quickanime"/>
 *     &lt;enumeration value="application/vnd.epson.salt"/>
 *     &lt;enumeration value="application/vnd.epson.ssf"/>
 *     &lt;enumeration value="application/vnd.ericsson.quickcall"/>
 *     &lt;enumeration value="application/vnd.eudora.data"/>
 *     &lt;enumeration value="application/vnd.fdf"/>
 *     &lt;enumeration value="application/vnd.ffsns"/>
 *     &lt;enumeration value="application/vnd.fints"/>
 *     &lt;enumeration value="application/vnd.framemaker"/>
 *     &lt;enumeration value="application/vnd.fsc.weblaunch"/>
 *     &lt;enumeration value="application/vnd.fujitsu.oasys"/>
 *     &lt;enumeration value="application/vnd.fujitsu.oasys2"/>
 *     &lt;enumeration value="application/vnd.fujitsu.oasys3"/>
 *     &lt;enumeration value="application/vnd.fujitsu.oasysgp"/>
 *     &lt;enumeration value="application/vnd.fujitsu.oasysprs"/>
 *     &lt;enumeration value="application/vnd.fujixerox.ddd"/>
 *     &lt;enumeration value="application/vnd.fujixerox.docuworks"/>
 *     &lt;enumeration value="application/vnd.fujixerox.docuworks.binder"/>
 *     &lt;enumeration value="application/vnd.fut-misnet"/>
 *     &lt;enumeration value="application/vnd.genomatix.tuxedo"/>
 *     &lt;enumeration value="application/vnd.grafeq"/>
 *     &lt;enumeration value="application/vnd.groove-account"/>
 *     &lt;enumeration value="application/vnd.groove-help"/>
 *     &lt;enumeration value="application/vnd.groove-identity-message"/>
 *     &lt;enumeration value="application/vnd.groove-injector"/>
 *     &lt;enumeration value="application/vnd.groove-tool-message"/>
 *     &lt;enumeration value="application/vnd.groove-tool-template"/>
 *     &lt;enumeration value="application/vnd.groove-vcard"/>
 *     &lt;enumeration value="application/vnd.hbci"/>
 *     &lt;enumeration value="application/vnd.hcl-bireports"/>
 *     &lt;enumeration value="application/vnd.hhe.lesson-player"/>
 *     &lt;enumeration value="application/vnd.hp-HPGL"/>
 *     &lt;enumeration value="application/vnd.hp-PCL"/>
 *     &lt;enumeration value="application/vnd.hp-PCLXL"/>
 *     &lt;enumeration value="application/vnd.hp-hpid"/>
 *     &lt;enumeration value="application/vnd.hp-hps"/>
 *     &lt;enumeration value="application/vnd.httphone"/>
 *     &lt;enumeration value="application/vnd.hzn-3d-crossword"/>
 *     &lt;enumeration value="application/vnd.ibm.MiniPay"/>
 *     &lt;enumeration value="application/vnd.ibm.afplinedata"/>
 *     &lt;enumeration value="application/vnd.ibm.electronic-media"/>
 *     &lt;enumeration value="application/vnd.ibm.modcap"/>
 *     &lt;enumeration value="application/vnd.ibm.rights-management"/>
 *     &lt;enumeration value="application/vnd.ibm.secure-container"/>
 *     &lt;enumeration value="application/vnd.informix-visionary"/>
 *     &lt;enumeration value="application/vnd.intercon.formnet"/>
 *     &lt;enumeration value="application/vnd.intertrust.digibox"/>
 *     &lt;enumeration value="application/vnd.intertrust.nncp"/>
 *     &lt;enumeration value="application/vnd.intu.qbo"/>
 *     &lt;enumeration value="application/vnd.intu.qfx"/>
 *     &lt;enumeration value="application/vnd.ipunplugged.rcprofile"/>
 *     &lt;enumeration value="application/vnd.irepository.package+xml"/>
 *     &lt;enumeration value="application/vnd.is-xpr"/>
 *     &lt;enumeration value="application/vnd.japannet-directory-service"/>
 *     &lt;enumeration value="application/vnd.japannet-jpnstore-wakeup"/>
 *     &lt;enumeration value="application/vnd.japannet-payment-wakeup"/>
 *     &lt;enumeration value="application/vnd.japannet-registration"/>
 *     &lt;enumeration value="application/vnd.japannet-registration-wakeup"/>
 *     &lt;enumeration value="application/vnd.japannet-setstore-wakeup"/>
 *     &lt;enumeration value="application/vnd.japannet-verification"/>
 *     &lt;enumeration value="application/vnd.japannet-verification-wakeup"/>
 *     &lt;enumeration value="application/vnd.jisp"/>
 *     &lt;enumeration value="application/vnd.kde.karbon"/>
 *     &lt;enumeration value="application/vnd.kde.kchart"/>
 *     &lt;enumeration value="application/vnd.kde.kformula"/>
 *     &lt;enumeration value="application/vnd.kde.kivio"/>
 *     &lt;enumeration value="application/vnd.kde.kontour"/>
 *     &lt;enumeration value="application/vnd.kde.kpresenter"/>
 *     &lt;enumeration value="application/vnd.kde.kspread"/>
 *     &lt;enumeration value="application/vnd.kde.kword"/>
 *     &lt;enumeration value="application/vnd.kenameaapp"/>
 *     &lt;enumeration value="application/vnd.kidspiration"/>
 *     &lt;enumeration value="application/vnd.koan"/>
 *     &lt;enumeration value="application/vnd.liberty-request+xml"/>
 *     &lt;enumeration value="application/vnd.llamagraphics.life-balance.desktop"/>
 *     &lt;enumeration value="application/vnd.llamagraphics.life-balance.exchange+xml"/>
 *     &lt;enumeration value="application/vnd.lotus-1-2-3"/>
 *     &lt;enumeration value="application/vnd.lotus-approach"/>
 *     &lt;enumeration value="application/vnd.lotus-freelance"/>
 *     &lt;enumeration value="application/vnd.lotus-notes"/>
 *     &lt;enumeration value="application/vnd.lotus-organizer"/>
 *     &lt;enumeration value="application/vnd.lotus-screencam"/>
 *     &lt;enumeration value="application/vnd.lotus-wordpro"/>
 *     &lt;enumeration value="application/vnd.mcd"/>
 *     &lt;enumeration value="application/vnd.mediastation.cdkey"/>
 *     &lt;enumeration value="application/vnd.meridian-slingshot"/>
 *     &lt;enumeration value="application/vnd.mfmp"/>
 *     &lt;enumeration value="application/vnd.micrografx.flo"/>
 *     &lt;enumeration value="application/vnd.micrografx.igx"/>
 *     &lt;enumeration value="application/vnd.mif"/>
 *     &lt;enumeration value="application/vnd.minisoft-hp3000-save"/>
 *     &lt;enumeration value="application/vnd.mitsubishi.misty-guard.trustweb"/>
 *     &lt;enumeration value="application/vnd.mophun.application"/>
 *     &lt;enumeration value="application/vnd.mophun.certificate"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.adsi"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.fis"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.gotap"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.kmr"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.ttc"/>
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.wem"/>
 *     &lt;enumeration value="application/vnd.mozilla.xul+xml"/>
 *     &lt;enumeration value="application/vnd.ms-artgalry"/>
 *     &lt;enumeration value="application/vnd.ms-asf"/>
 *     &lt;enumeration value="application/vnd.ms-excel"/>
 *     &lt;enumeration value="application/vnd.ms-lrm"/>
 *     &lt;enumeration value="application/vnd.ms-powerpoint"/>
 *     &lt;enumeration value="application/vnd.ms-project"/>
 *     &lt;enumeration value="application/vnd.ms-tnef"/>
 *     &lt;enumeration value="application/vnd.ms-works"/>
 *     &lt;enumeration value="application/vnd.ms-wpl"/>
 *     &lt;enumeration value="application/vnd.mseq"/>
 *     &lt;enumeration value="application/vnd.msign"/>
 *     &lt;enumeration value="application/vnd.music-niff"/>
 *     &lt;enumeration value="application/vnd.musician"/>
 *     &lt;enumeration value="application/vnd.nervana"/>
 *     &lt;enumeration value="application/vnd.netfpx"/>
 *     &lt;enumeration value="application/vnd.noblenet-directory"/>
 *     &lt;enumeration value="application/vnd.noblenet-sealer"/>
 *     &lt;enumeration value="application/vnd.noblenet-web"/>
 *     &lt;enumeration value="application/vnd.nokia.landmark+wbxml"/>
 *     &lt;enumeration value="application/vnd.nokia.landmark+xml"/>
 *     &lt;enumeration value="application/vnd.nokia.landmarkcollection+xml"/>
 *     &lt;enumeration value="application/vnd.nokia.radio-preset"/>
 *     &lt;enumeration value="application/vnd.nokia.radio-presets"/>
 *     &lt;enumeration value="application/vnd.novadigm.EDM"/>
 *     &lt;enumeration value="application/vnd.novadigm.EDX"/>
 *     &lt;enumeration value="application/vnd.novadigm.EXT"/>
 *     &lt;enumeration value="application/vnd.obn"/>
 *     &lt;enumeration value="application/vnd.omads-email+xml"/>
 *     &lt;enumeration value="application/vnd.omads-file+xml"/>
 *     &lt;enumeration value="application/vnd.omads-folder+xml"/>
 *     &lt;enumeration value="application/vnd.osa.netdeploy"/>
 *     &lt;enumeration value="application/vnd.palm"/>
 *     &lt;enumeration value="application/vnd.paos.xml"/>
 *     &lt;enumeration value="application/vnd.pg.format"/>
 *     &lt;enumeration value="application/vnd.pg.osasli"/>
 *     &lt;enumeration value="application/vnd.picsel"/>
 *     &lt;enumeration value="application/vnd.powerbuilder6"/>
 *     &lt;enumeration value="application/vnd.powerbuilder6-s"/>
 *     &lt;enumeration value="application/vnd.powerbuilder7"/>
 *     &lt;enumeration value="application/vnd.powerbuilder7-s"/>
 *     &lt;enumeration value="application/vnd.powerbuilder75"/>
 *     &lt;enumeration value="application/vnd.powerbuilder75-s"/>
 *     &lt;enumeration value="application/vnd.previewsystems.box"/>
 *     &lt;enumeration value="application/vnd.publishare-delta-tree"/>
 *     &lt;enumeration value="application/vnd.pvi.ptid1"/>
 *     &lt;enumeration value="application/vnd.pwg-multiplexed"/>
 *     &lt;enumeration value="application/vnd.pwg-xhtml-print+xml"/>
 *     &lt;enumeration value="application/vnd.rapid"/>
 *     &lt;enumeration value="application/vnd.s3sms"/>
 *     &lt;enumeration value="application/vnd.sealed.doc"/>
 *     &lt;enumeration value="application/vnd.sealed.eml"/>
 *     &lt;enumeration value="application/vnd.sealed.mht"/>
 *     &lt;enumeration value="application/vnd.sealed.net"/>
 *     &lt;enumeration value="application/vnd.sealed.ppt"/>
 *     &lt;enumeration value="application/vnd.sealed.xls"/>
 *     &lt;enumeration value="application/vnd.sealedmedia.softseal.html"/>
 *     &lt;enumeration value="application/vnd.sealedmedia.softseal.pdf"/>
 *     &lt;enumeration value="application/vnd.seemail"/>
 *     &lt;enumeration value="application/vnd.shana.informed.formdata"/>
 *     &lt;enumeration value="application/vnd.shana.informed.formtemplate"/>
 *     &lt;enumeration value="application/vnd.shana.informed.interchange"/>
 *     &lt;enumeration value="application/vnd.shana.informed.package"/>
 *     &lt;enumeration value="application/vnd.smaf"/>
 *     &lt;enumeration value="application/vnd.sss-cod"/>
 *     &lt;enumeration value="application/vnd.sss-dtf"/>
 *     &lt;enumeration value="application/vnd.sss-ntf"/>
 *     &lt;enumeration value="application/vnd.street-stream"/>
 *     &lt;enumeration value="application/vnd.sus-calendar"/>
 *     &lt;enumeration value="application/vnd.svd"/>
 *     &lt;enumeration value="application/vnd.swiftview-ics"/>
 *     &lt;enumeration value="application/vnd.syncml.+xml"/>
 *     &lt;enumeration value="application/vnd.syncml.ds.notification"/>
 *     &lt;enumeration value="application/vnd.triscape.mxs"/>
 *     &lt;enumeration value="application/vnd.trueapp"/>
 *     &lt;enumeration value="application/vnd.truedoc"/>
 *     &lt;enumeration value="application/vnd.ufdl"/>
 *     &lt;enumeration value="application/vnd.uiq.theme"/>
 *     &lt;enumeration value="application/vnd.uplanet.alert"/>
 *     &lt;enumeration value="application/vnd.uplanet.alert-wbxml"/>
 *     &lt;enumeration value="application/vnd.uplanet.bearer-choice"/>
 *     &lt;enumeration value="application/vnd.uplanet.bearer-choice-wbxml"/>
 *     &lt;enumeration value="application/vnd.uplanet.cacheop"/>
 *     &lt;enumeration value="application/vnd.uplanet.cacheop-wbxml"/>
 *     &lt;enumeration value="application/vnd.uplanet.channel"/>
 *     &lt;enumeration value="application/vnd.uplanet.channel-wbxml"/>
 *     &lt;enumeration value="application/vnd.uplanet.list"/>
 *     &lt;enumeration value="application/vnd.uplanet.list-wbxml"/>
 *     &lt;enumeration value="application/vnd.uplanet.listcmd"/>
 *     &lt;enumeration value="application/vnd.uplanet.listcmd-wbxml"/>
 *     &lt;enumeration value="application/vnd.uplanet.signal"/>
 *     &lt;enumeration value="application/vnd.vcx"/>
 *     &lt;enumeration value="application/vnd.vectorworks"/>
 *     &lt;enumeration value="application/vnd.vidsoft.vidconference"/>
 *     &lt;enumeration value="application/vnd.visio"/>
 *     &lt;enumeration value="application/vnd.visionary"/>
 *     &lt;enumeration value="application/vnd.vividence.scriptfile"/>
 *     &lt;enumeration value="application/vnd.vsf"/>
 *     &lt;enumeration value="application/vnd.wap.sic"/>
 *     &lt;enumeration value="application/vnd.wap.slc"/>
 *     &lt;enumeration value="application/vnd.wap.wbxml"/>
 *     &lt;enumeration value="application/vnd.wap.wmlc"/>
 *     &lt;enumeration value="application/vnd.wap.wmlscriptc"/>
 *     &lt;enumeration value="application/vnd.webturbo"/>
 *     &lt;enumeration value="application/vnd.wordperfect"/>
 *     &lt;enumeration value="application/vnd.wqd"/>
 *     &lt;enumeration value="application/vnd.wrq-hp3000-labelled"/>
 *     &lt;enumeration value="application/vnd.wt.stf"/>
 *     &lt;enumeration value="application/vnd.wv.csp+wbxml"/>
 *     &lt;enumeration value="application/vnd.wv.csp+xml"/>
 *     &lt;enumeration value="application/vnd.wv.ssp+xml"/>
 *     &lt;enumeration value="application/vnd.xara"/>
 *     &lt;enumeration value="application/vnd.xfdl"/>
 *     &lt;enumeration value="application/vnd.yamaha.hv-dic"/>
 *     &lt;enumeration value="application/vnd.yamaha.hv-script"/>
 *     &lt;enumeration value="application/vnd.yamaha.hv-voice"/>
 *     &lt;enumeration value="application/vnd.yamaha.smaf-audio"/>
 *     &lt;enumeration value="application/vnd.yamaha.smaf-phrase"/>
 *     &lt;enumeration value="application/vnd.yellowriver-custom-menu"/>
 *     &lt;enumeration value="application/watcherinfo+xml"/>
 *     &lt;enumeration value="application/whoispp-query"/>
 *     &lt;enumeration value="application/whoispp-response"/>
 *     &lt;enumeration value="application/wita"/>
 *     &lt;enumeration value="application/wordperfect5.1"/>
 *     &lt;enumeration value="application/x400-bp"/>
 *     &lt;enumeration value="application/xhtml+xml"/>
 *     &lt;enumeration value="application/xml"/>
 *     &lt;enumeration value="application/xml-dtd"/>
 *     &lt;enumeration value="application/xml-external-parsed-entity"/>
 *     &lt;enumeration value="application/xmpp+xml"/>
 *     &lt;enumeration value="application/xop+xml"/>
 *     &lt;enumeration value="application/zip"/>
 *     &lt;enumeration value="audio/32kadpcm"/>
 *     &lt;enumeration value="audio/3gpp"/>
 *     &lt;enumeration value="audio/AMR"/>
 *     &lt;enumeration value="audio/AMR-WB"/>
 *     &lt;enumeration value="audio/BV16"/>
 *     &lt;enumeration value="audio/BV32"/>
 *     &lt;enumeration value="audio/CN"/>
 *     &lt;enumeration value="audio/DAT12"/>
 *     &lt;enumeration value="audio/DVI4"/>
 *     &lt;enumeration value="audio/EVRC"/>
 *     &lt;enumeration value="audio/EVRC-QCP"/>
 *     &lt;enumeration value="audio/EVRC0"/>
 *     &lt;enumeration value="audio/G.722.1"/>
 *     &lt;enumeration value="audio/G722"/>
 *     &lt;enumeration value="audio/G723"/>
 *     &lt;enumeration value="audio/G726-16"/>
 *     &lt;enumeration value="audio/G726-24"/>
 *     &lt;enumeration value="audio/G726-32"/>
 *     &lt;enumeration value="audio/G726-40"/>
 *     &lt;enumeration value="audio/G728"/>
 *     &lt;enumeration value="audio/G729"/>
 *     &lt;enumeration value="audio/G729D"/>
 *     &lt;enumeration value="audio/G729E"/>
 *     &lt;enumeration value="audio/GSM"/>
 *     &lt;enumeration value="audio/GSM-EFR"/>
 *     &lt;enumeration value="audio/L16"/>
 *     &lt;enumeration value="audio/L20"/>
 *     &lt;enumeration value="audio/L24"/>
 *     &lt;enumeration value="audio/L8"/>
 *     &lt;enumeration value="audio/LPC"/>
 *     &lt;enumeration value="audio/MP4A-LATM"/>
 *     &lt;enumeration value="audio/MPA"/>
 *     &lt;enumeration value="audio/PCMA"/>
 *     &lt;enumeration value="audio/PCMU"/>
 *     &lt;enumeration value="audio/QCELP"/>
 *     &lt;enumeration value="audio/RED"/>
 *     &lt;enumeration value="audio/SMV"/>
 *     &lt;enumeration value="audio/SMV-QCP"/>
 *     &lt;enumeration value="audio/SMV0"/>
 *     &lt;enumeration value="audio/VDVI"/>
 *     &lt;enumeration value="audio/basic"/>
 *     &lt;enumeration value="audio/clearmode"/>
 *     &lt;enumeration value="audio/dsr-es201108"/>
 *     &lt;enumeration value="audio/dsr-es202050"/>
 *     &lt;enumeration value="audio/dsr-es202211"/>
 *     &lt;enumeration value="audio/dsr-es202212"/>
 *     &lt;enumeration value="audio/iLBC"/>
 *     &lt;enumeration value="audio/mpa-robust"/>
 *     &lt;enumeration value="audio/mpeg"/>
 *     &lt;enumeration value="audio/mpeg4-generic"/>
 *     &lt;enumeration value="audio/parityfec"/>
 *     &lt;enumeration value="audio/prs.sid"/>
 *     &lt;enumeration value="audio/telephone-event"/>
 *     &lt;enumeration value="audio/tone"/>
 *     &lt;enumeration value="audio/vnd.3gpp.iufp"/>
 *     &lt;enumeration value="audio/vnd.audiokoz"/>
 *     &lt;enumeration value="audio/vnd.cisco.nse"/>
 *     &lt;enumeration value="audio/vnd.cns.anp1"/>
 *     &lt;enumeration value="audio/vnd.cns.inf1"/>
 *     &lt;enumeration value="audio/vnd.digital-winds"/>
 *     &lt;enumeration value="audio/vnd.everad.plj"/>
 *     &lt;enumeration value="audio/vnd.lucent.voice"/>
 *     &lt;enumeration value="audio/vnd.nokia.mobile-xmf"/>
 *     &lt;enumeration value="audio/vnd.nortel.vbk"/>
 *     &lt;enumeration value="audio/vnd.nuera.ecelp4800"/>
 *     &lt;enumeration value="audio/vnd.nuera.ecelp7470"/>
 *     &lt;enumeration value="audio/vnd.nuera.ecelp9600"/>
 *     &lt;enumeration value="audio/vnd.octel.sbc"/>
 *     &lt;enumeration value="audio/vnd.qcelp"/>
 *     &lt;enumeration value="audio/vnd.rhetorex.32kadpcm"/>
 *     &lt;enumeration value="audio/vnd.sealedmedia.softseal.mpeg"/>
 *     &lt;enumeration value="audio/vnd.vmx.cvsd"/>
 *     &lt;enumeration value="image/cgm"/>
 *     &lt;enumeration value="image/fits"/>
 *     &lt;enumeration value="image/g3fax"/>
 *     &lt;enumeration value="image/gif"/>
 *     &lt;enumeration value="image/ief"/>
 *     &lt;enumeration value="image/jp2"/>
 *     &lt;enumeration value="image/jpeg"/>
 *     &lt;enumeration value="image/jpm"/>
 *     &lt;enumeration value="image/jpx"/>
 *     &lt;enumeration value="image/naplps"/>
 *     &lt;enumeration value="image/png"/>
 *     &lt;enumeration value="image/prs.btif"/>
 *     &lt;enumeration value="image/prs.pti"/>
 *     &lt;enumeration value="image/t38"/>
 *     &lt;enumeration value="image/tiff"/>
 *     &lt;enumeration value="image/tiff-fx"/>
 *     &lt;enumeration value="image/vnd.cns.inf2"/>
 *     &lt;enumeration value="image/vnd.djvu"/>
 *     &lt;enumeration value="image/vnd.dwg"/>
 *     &lt;enumeration value="image/vnd.dxf"/>
 *     &lt;enumeration value="image/vnd.fastbidsheet"/>
 *     &lt;enumeration value="image/vnd.fpx"/>
 *     &lt;enumeration value="image/vnd.fst"/>
 *     &lt;enumeration value="image/vnd.fujixerox.edmics-mmr"/>
 *     &lt;enumeration value="image/vnd.fujixerox.edmics-rlc"/>
 *     &lt;enumeration value="image/vnd.globalgraphics.pgb"/>
 *     &lt;enumeration value="image/vnd.microsoft.icon"/>
 *     &lt;enumeration value="image/vnd.mix"/>
 *     &lt;enumeration value="image/vnd.ms-modi"/>
 *     &lt;enumeration value="image/vnd.net-fpx"/>
 *     &lt;enumeration value="image/vnd.sealed.png"/>
 *     &lt;enumeration value="image/vnd.sealedmedia.softseal.gif"/>
 *     &lt;enumeration value="image/vnd.sealedmedia.softseal.jpg"/>
 *     &lt;enumeration value="image/vnd.svf"/>
 *     &lt;enumeration value="image/vnd.wap.wbmp"/>
 *     &lt;enumeration value="image/vnd.xiff"/>
 *     &lt;enumeration value="message/CPIM"/>
 *     &lt;enumeration value="message/delivery-status"/>
 *     &lt;enumeration value="message/disposition-notification"/>
 *     &lt;enumeration value="message/external-body"/>
 *     &lt;enumeration value="message/http"/>
 *     &lt;enumeration value="message/news"/>
 *     &lt;enumeration value="message/partial"/>
 *     &lt;enumeration value="message/rfc822"/>
 *     &lt;enumeration value="message/s-http"/>
 *     &lt;enumeration value="message/sip"/>
 *     &lt;enumeration value="message/sipfrag"/>
 *     &lt;enumeration value="message/tracking-status"/>
 *     &lt;enumeration value="model/iges"/>
 *     &lt;enumeration value="model/mesh"/>
 *     &lt;enumeration value="model/vnd.dwf"/>
 *     &lt;enumeration value="model/vnd.flatland.3dml"/>
 *     &lt;enumeration value="model/vnd.gdl"/>
 *     &lt;enumeration value="model/vnd.gs-gdl"/>
 *     &lt;enumeration value="model/vnd.gtw"/>
 *     &lt;enumeration value="model/vnd.mts"/>
 *     &lt;enumeration value="model/vnd.parasolid.transmit.binary"/>
 *     &lt;enumeration value="model/vnd.parasolid.transmit.text"/>
 *     &lt;enumeration value="model/vnd.vtu"/>
 *     &lt;enumeration value="model/vrml"/>
 *     &lt;enumeration value="multipart/alternative"/>
 *     &lt;enumeration value="multipart/appledouble"/>
 *     &lt;enumeration value="multipart/byteranges"/>
 *     &lt;enumeration value="multipart/digest"/>
 *     &lt;enumeration value="multipart/encrypted"/>
 *     &lt;enumeration value="multipart/form-data"/>
 *     &lt;enumeration value="multipart/header-set"/>
 *     &lt;enumeration value="multipart/mixed"/>
 *     &lt;enumeration value="multipart/parallel"/>
 *     &lt;enumeration value="multipart/related"/>
 *     &lt;enumeration value="multipart/report"/>
 *     &lt;enumeration value="multipart/signed"/>
 *     &lt;enumeration value="multipart/voice-message"/>
 *     &lt;enumeration value="text/RED"/>
 *     &lt;enumeration value="text/calendar"/>
 *     &lt;enumeration value="text/css"/>
 *     &lt;enumeration value="text/csv"/>
 *     &lt;enumeration value="text/directory"/>
 *     &lt;enumeration value="text/dns"/>
 *     &lt;enumeration value="text/enriched"/>
 *     &lt;enumeration value="text/html"/>
 *     &lt;enumeration value="text/parityfec"/>
 *     &lt;enumeration value="text/plain"/>
 *     &lt;enumeration value="text/prs.fallenstein.rst"/>
 *     &lt;enumeration value="text/prs.lines.tag"/>
 *     &lt;enumeration value="text/rfc822-headers"/>
 *     &lt;enumeration value="text/richtext"/>
 *     &lt;enumeration value="text/rtf"/>
 *     &lt;enumeration value="text/sgml"/>
 *     &lt;enumeration value="text/t140"/>
 *     &lt;enumeration value="text/tab-separated-values"/>
 *     &lt;enumeration value="text/troff"/>
 *     &lt;enumeration value="text/uri-list"/>
 *     &lt;enumeration value="text/vnd.DMClientScript"/>
 *     &lt;enumeration value="text/vnd.IPTC.NITF"/>
 *     &lt;enumeration value="text/vnd.IPTC.NewsML"/>
 *     &lt;enumeration value="text/vnd.abc"/>
 *     &lt;enumeration value="text/vnd.curl"/>
 *     &lt;enumeration value="text/vnd.esmertec.theme-descriptor"/>
 *     &lt;enumeration value="text/vnd.fly"/>
 *     &lt;enumeration value="text/vnd.fmi.flexstor"/>
 *     &lt;enumeration value="text/vnd.in3d.3dml"/>
 *     &lt;enumeration value="text/vnd.in3d.spot"/>
 *     &lt;enumeration value="text/vnd.latex-z"/>
 *     &lt;enumeration value="text/vnd.motorola.reflex"/>
 *     &lt;enumeration value="text/vnd.ms-mediapackage"/>
 *     &lt;enumeration value="text/vnd.net2phone.commcenter.command"/>
 *     &lt;enumeration value="text/vnd.sun.j2me.app-descriptor"/>
 *     &lt;enumeration value="text/vnd.wap.si"/>
 *     &lt;enumeration value="text/vnd.wap.sl"/>
 *     &lt;enumeration value="text/vnd.wap.wml"/>
 *     &lt;enumeration value="text/vnd.wap.wmlscript"/>
 *     &lt;enumeration value="text/xml"/>
 *     &lt;enumeration value="text/xml-external-parsed-entity"/>
 *     &lt;enumeration value="video/3gpp"/>
 *     &lt;enumeration value="video/BMPEG"/>
 *     &lt;enumeration value="video/BT656"/>
 *     &lt;enumeration value="video/CelB"/>
 *     &lt;enumeration value="video/DV"/>
 *     &lt;enumeration value="video/H261"/>
 *     &lt;enumeration value="video/H263"/>
 *     &lt;enumeration value="video/H263-1998"/>
 *     &lt;enumeration value="video/H263-2000"/>
 *     &lt;enumeration value="video/H264"/>
 *     &lt;enumeration value="video/JPEG"/>
 *     &lt;enumeration value="video/MJ2"/>
 *     &lt;enumeration value="video/MP1S"/>
 *     &lt;enumeration value="video/MP2P"/>
 *     &lt;enumeration value="video/MP2T"/>
 *     &lt;enumeration value="video/MP4V-ES"/>
 *     &lt;enumeration value="video/MPV"/>
 *     &lt;enumeration value="video/SMPTE292M"/>
 *     &lt;enumeration value="video/mpeg"/>
 *     &lt;enumeration value="video/mpeg4-generic"/>
 *     &lt;enumeration value="video/nv"/>
 *     &lt;enumeration value="video/parityfec"/>
 *     &lt;enumeration value="video/pointer"/>
 *     &lt;enumeration value="video/quicktime"/>
 *     &lt;enumeration value="video/raw"/>
 *     &lt;enumeration value="video/vnd.fvt"/>
 *     &lt;enumeration value="video/vnd.motorola.video"/>
 *     &lt;enumeration value="video/vnd.motorola.videop"/>
 *     &lt;enumeration value="video/vnd.mpegurl"/>
 *     &lt;enumeration value="video/vnd.nokia.interleaved-multimedia"/>
 *     &lt;enumeration value="video/vnd.objectvideo"/>
 *     &lt;enumeration value="video/vnd.sealed.mpeg1"/>
 *     &lt;enumeration value="video/vnd.sealed.mpeg4"/>
 *     &lt;enumeration value="video/vnd.sealed.swf"/>
 *     &lt;enumeration value="video/vnd.sealedmedia.softseal.mov"/>
 *     &lt;enumeration value="video/vnd.vivo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BinaryObjectMimeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:specification:IANAMIMEMediaType:2003")
@XmlEnum
public enum BinaryObjectMimeCodeContentType {

    @XmlEnumValue("application/CSTAdata+xml")
    APPLICATION_CST_ADATA_XML("application/CSTAdata+xml"),
    @XmlEnumValue("application/EDI-Consent")
    APPLICATION_EDI_CONSENT("application/EDI-Consent"),
    @XmlEnumValue("application/EDI-X12")
    APPLICATION_EDI_X_12("application/EDI-X12"),
    @XmlEnumValue("application/EDIFACT")
    APPLICATION_EDIFACT("application/EDIFACT"),
    @XmlEnumValue("application/activemessage")
    APPLICATION_ACTIVEMESSAGE("application/activemessage"),
    @XmlEnumValue("application/andrew-inset")
    APPLICATION_ANDREW_INSET("application/andrew-inset"),
    @XmlEnumValue("application/applefile")
    APPLICATION_APPLEFILE("application/applefile"),
    @XmlEnumValue("application/atomicmail")
    APPLICATION_ATOMICMAIL("application/atomicmail"),
    @XmlEnumValue("application/batch-SMTP")
    APPLICATION_BATCH_SMTP("application/batch-SMTP"),
    @XmlEnumValue("application/beep+xml")
    APPLICATION_BEEP_XML("application/beep+xml"),
    @XmlEnumValue("application/cals-1840")
    APPLICATION_CALS_1840("application/cals-1840"),
    @XmlEnumValue("application/cnrp+xml")
    APPLICATION_CNRP_XML("application/cnrp+xml"),
    @XmlEnumValue("application/commonground")
    APPLICATION_COMMONGROUND("application/commonground"),
    @XmlEnumValue("application/cpl+xml")
    APPLICATION_CPL_XML("application/cpl+xml"),
    @XmlEnumValue("application/csta+xml")
    APPLICATION_CSTA_XML("application/csta+xml"),
    @XmlEnumValue("application/cybercash")
    APPLICATION_CYBERCASH("application/cybercash"),
    @XmlEnumValue("application/dca-rft")
    APPLICATION_DCA_RFT("application/dca-rft"),
    @XmlEnumValue("application/dec-dx")
    APPLICATION_DEC_DX("application/dec-dx"),
    @XmlEnumValue("application/dialog-info+xml")
    APPLICATION_DIALOG_INFO_XML("application/dialog-info+xml"),
    @XmlEnumValue("application/dicom")
    APPLICATION_DICOM("application/dicom"),
    @XmlEnumValue("application/dns")
    APPLICATION_DNS("application/dns"),
    @XmlEnumValue("application/dvcs")
    APPLICATION_DVCS("application/dvcs"),
    @XmlEnumValue("application/epp+xml")
    APPLICATION_EPP_XML("application/epp+xml"),
    @XmlEnumValue("application/eshop")
    APPLICATION_ESHOP("application/eshop"),
    @XmlEnumValue("application/fits")
    APPLICATION_FITS("application/fits"),
    @XmlEnumValue("application/font-tdpfr")
    APPLICATION_FONT_TDPFR("application/font-tdpfr"),
    @XmlEnumValue("application/http")
    APPLICATION_HTTP("application/http"),
    @XmlEnumValue("application/hyperstudio")
    APPLICATION_HYPERSTUDIO("application/hyperstudio"),
    @XmlEnumValue("application/iges")
    APPLICATION_IGES("application/iges"),
    @XmlEnumValue("application/im-iscomposing+xml")
    APPLICATION_IM_ISCOMPOSING_XML("application/im-iscomposing+xml"),
    @XmlEnumValue("application/index")
    APPLICATION_INDEX("application/index"),
    @XmlEnumValue("application/index.cmd")
    APPLICATION_INDEX_CMD("application/index.cmd"),
    @XmlEnumValue("application/index.obj")
    APPLICATION_INDEX_OBJ("application/index.obj"),
    @XmlEnumValue("application/index.response")
    APPLICATION_INDEX_RESPONSE("application/index.response"),
    @XmlEnumValue("application/index.vnd")
    APPLICATION_INDEX_VND("application/index.vnd"),
    @XmlEnumValue("application/iotp")
    APPLICATION_IOTP("application/iotp"),
    @XmlEnumValue("application/ipp")
    APPLICATION_IPP("application/ipp"),
    @XmlEnumValue("application/isup")
    APPLICATION_ISUP("application/isup"),
    @XmlEnumValue("application/kpml-request+xml")
    APPLICATION_KPML_REQUEST_XML("application/kpml-request+xml"),
    @XmlEnumValue("application/kpml-response+xml")
    APPLICATION_KPML_RESPONSE_XML("application/kpml-response+xml"),
    @XmlEnumValue("application/mac-binhex40")
    APPLICATION_MAC_BINHEX_40("application/mac-binhex40"),
    @XmlEnumValue("application/macwriteii")
    APPLICATION_MACWRITEII("application/macwriteii"),
    @XmlEnumValue("application/marc")
    APPLICATION_MARC("application/marc"),
    @XmlEnumValue("application/mathematica")
    APPLICATION_MATHEMATICA("application/mathematica"),
    @XmlEnumValue("application/mbox")
    APPLICATION_MBOX("application/mbox"),
    @XmlEnumValue("application/mikey")
    APPLICATION_MIKEY("application/mikey"),
    @XmlEnumValue("application/mpeg4-generic")
    APPLICATION_MPEG_4_GENERIC("application/mpeg4-generic"),
    @XmlEnumValue("application/msword")
    APPLICATION_MSWORD("application/msword"),
    @XmlEnumValue("application/news-message-id")
    APPLICATION_NEWS_MESSAGE_ID("application/news-message-id"),
    @XmlEnumValue("application/news-transmission")
    APPLICATION_NEWS_TRANSMISSION("application/news-transmission"),
    @XmlEnumValue("application/ocsp-request")
    APPLICATION_OCSP_REQUEST("application/ocsp-request"),
    @XmlEnumValue("application/ocsp-response")
    APPLICATION_OCSP_RESPONSE("application/ocsp-response"),
    @XmlEnumValue("application/octet-stream")
    APPLICATION_OCTET_STREAM("application/octet-stream"),
    @XmlEnumValue("application/oda")
    APPLICATION_ODA("application/oda"),
    @XmlEnumValue("application/ogg")
    APPLICATION_OGG("application/ogg"),
    @XmlEnumValue("application/parityfec")
    APPLICATION_PARITYFEC("application/parityfec"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf"),
    @XmlEnumValue("application/pgp-encrypted")
    APPLICATION_PGP_ENCRYPTED("application/pgp-encrypted"),
    @XmlEnumValue("application/pgp-keys")
    APPLICATION_PGP_KEYS("application/pgp-keys"),
    @XmlEnumValue("application/pgp-signature")
    APPLICATION_PGP_SIGNATURE("application/pgp-signature"),
    @XmlEnumValue("application/pidf+xml")
    APPLICATION_PIDF_XML("application/pidf+xml"),
    @XmlEnumValue("application/pkcs10")
    APPLICATION_PKCS_10("application/pkcs10"),
    @XmlEnumValue("application/pkcs7-mime")
    APPLICATION_PKCS_7_MIME("application/pkcs7-mime"),
    @XmlEnumValue("application/pkcs7-signature")
    APPLICATION_PKCS_7_SIGNATURE("application/pkcs7-signature"),
    @XmlEnumValue("application/pkix-cert")
    APPLICATION_PKIX_CERT("application/pkix-cert"),
    @XmlEnumValue("application/pkix-crl")
    APPLICATION_PKIX_CRL("application/pkix-crl"),
    @XmlEnumValue("application/pkix-pkipath")
    APPLICATION_PKIX_PKIPATH("application/pkix-pkipath"),
    @XmlEnumValue("application/pkixcmp")
    APPLICATION_PKIXCMP("application/pkixcmp"),
    @XmlEnumValue("application/postscript")
    APPLICATION_POSTSCRIPT("application/postscript"),
    @XmlEnumValue("application/prs.alvestrand.titrax-sheet")
    APPLICATION_PRS_ALVESTRAND_TITRAX_SHEET("application/prs.alvestrand.titrax-sheet"),
    @XmlEnumValue("application/prs.cww")
    APPLICATION_PRS_CWW("application/prs.cww"),
    @XmlEnumValue("application/prs.nprend")
    APPLICATION_PRS_NPREND("application/prs.nprend"),
    @XmlEnumValue("application/prs.plucker")
    APPLICATION_PRS_PLUCKER("application/prs.plucker"),
    @XmlEnumValue("application/qsig")
    APPLICATION_QSIG("application/qsig"),
    @XmlEnumValue("application/rdf+xml")
    APPLICATION_RDF_XML("application/rdf+xml"),
    @XmlEnumValue("application/reginfo+xml")
    APPLICATION_REGINFO_XML("application/reginfo+xml"),
    @XmlEnumValue("application/remote-printing")
    APPLICATION_REMOTE_PRINTING("application/remote-printing"),
    @XmlEnumValue("application/resource-lists+xml")
    APPLICATION_RESOURCE_LISTS_XML("application/resource-lists+xml"),
    @XmlEnumValue("application/riscos")
    APPLICATION_RISCOS("application/riscos"),
    @XmlEnumValue("application/rls-services+xml")
    APPLICATION_RLS_SERVICES_XML("application/rls-services+xml"),
    @XmlEnumValue("application/rtf")
    APPLICATION_RTF("application/rtf"),
    @XmlEnumValue("application/samlassertion+xml")
    APPLICATION_SAMLASSERTION_XML("application/samlassertion+xml"),
    @XmlEnumValue("application/samlmetadata+xml")
    APPLICATION_SAMLMETADATA_XML("application/samlmetadata+xml"),
    @XmlEnumValue("application/sbml+xml")
    APPLICATION_SBML_XML("application/sbml+xml"),
    @XmlEnumValue("application/sdp")
    APPLICATION_SDP("application/sdp"),
    @XmlEnumValue("application/set-payment")
    APPLICATION_SET_PAYMENT("application/set-payment"),
    @XmlEnumValue("application/set-payment-initiation")
    APPLICATION_SET_PAYMENT_INITIATION("application/set-payment-initiation"),
    @XmlEnumValue("application/set-registration")
    APPLICATION_SET_REGISTRATION("application/set-registration"),
    @XmlEnumValue("application/set-registration-initiation")
    APPLICATION_SET_REGISTRATION_INITIATION("application/set-registration-initiation"),
    @XmlEnumValue("application/sgml")
    APPLICATION_SGML("application/sgml"),
    @XmlEnumValue("application/sgml-open-catalog")
    APPLICATION_SGML_OPEN_CATALOG("application/sgml-open-catalog"),
    @XmlEnumValue("application/shf+xml")
    APPLICATION_SHF_XML("application/shf+xml"),
    @XmlEnumValue("application/sieve")
    APPLICATION_SIEVE("application/sieve"),
    @XmlEnumValue("application/simple-filter+xml")
    APPLICATION_SIMPLE_FILTER_XML("application/simple-filter+xml"),
    @XmlEnumValue("application/simple-message-summary")
    APPLICATION_SIMPLE_MESSAGE_SUMMARY("application/simple-message-summary"),
    @XmlEnumValue("application/slate")
    APPLICATION_SLATE("application/slate"),
    @XmlEnumValue("application/soap+xml")
    APPLICATION_SOAP_XML("application/soap+xml"),
    @XmlEnumValue("application/spirits-event+xml")
    APPLICATION_SPIRITS_EVENT_XML("application/spirits-event+xml"),
    @XmlEnumValue("application/timestamp-query")
    APPLICATION_TIMESTAMP_QUERY("application/timestamp-query"),
    @XmlEnumValue("application/timestamp-reply")
    APPLICATION_TIMESTAMP_REPLY("application/timestamp-reply"),
    @XmlEnumValue("application/tve-trigger")
    APPLICATION_TVE_TRIGGER("application/tve-trigger"),
    @XmlEnumValue("application/vemmi")
    APPLICATION_VEMMI("application/vemmi"),
    @XmlEnumValue("application/vnd.3M.Post-it-Notes")
    APPLICATION_VND_3_M_POST_IT_NOTES("application/vnd.3M.Post-it-Notes"),
    @XmlEnumValue("application/vnd.3gpp.pic-bw-large")
    APPLICATION_VND_3_GPP_PIC_BW_LARGE("application/vnd.3gpp.pic-bw-large"),
    @XmlEnumValue("application/vnd.3gpp.pic-bw-small")
    APPLICATION_VND_3_GPP_PIC_BW_SMALL("application/vnd.3gpp.pic-bw-small"),
    @XmlEnumValue("application/vnd.3gpp.pic-bw-var")
    APPLICATION_VND_3_GPP_PIC_BW_VAR("application/vnd.3gpp.pic-bw-var"),
    @XmlEnumValue("application/vnd.3gpp.sms")
    APPLICATION_VND_3_GPP_SMS("application/vnd.3gpp.sms"),
    @XmlEnumValue("application/vnd.FloGraphIt")
    APPLICATION_VND_FLO_GRAPH_IT("application/vnd.FloGraphIt"),
    @XmlEnumValue("application/vnd.Kinar")
    APPLICATION_VND_KINAR("application/vnd.Kinar"),
    @XmlEnumValue("application/vnd.Mobius.DAF")
    APPLICATION_VND_MOBIUS_DAF("application/vnd.Mobius.DAF"),
    @XmlEnumValue("application/vnd.Mobius.DIS")
    APPLICATION_VND_MOBIUS_DIS("application/vnd.Mobius.DIS"),
    @XmlEnumValue("application/vnd.Mobius.MBK")
    APPLICATION_VND_MOBIUS_MBK("application/vnd.Mobius.MBK"),
    @XmlEnumValue("application/vnd.Mobius.MQY")
    APPLICATION_VND_MOBIUS_MQY("application/vnd.Mobius.MQY"),
    @XmlEnumValue("application/vnd.Mobius.MSL")
    APPLICATION_VND_MOBIUS_MSL("application/vnd.Mobius.MSL"),
    @XmlEnumValue("application/vnd.Mobius.PLC")
    APPLICATION_VND_MOBIUS_PLC("application/vnd.Mobius.PLC"),
    @XmlEnumValue("application/vnd.Mobius.TXF")
    APPLICATION_VND_MOBIUS_TXF("application/vnd.Mobius.TXF"),
    @XmlEnumValue("application/vnd.Quark.QuarkXPress")
    APPLICATION_VND_QUARK_QUARK_X_PRESS("application/vnd.Quark.QuarkXPress"),
    @XmlEnumValue("application/vnd.RenLearn.rlprint")
    APPLICATION_VND_REN_LEARN_RLPRINT("application/vnd.RenLearn.rlprint"),
    @XmlEnumValue("application/vnd.accpac.simply.aso")
    APPLICATION_VND_ACCPAC_SIMPLY_ASO("application/vnd.accpac.simply.aso"),
    @XmlEnumValue("application/vnd.accpac.simply.imp")
    APPLICATION_VND_ACCPAC_SIMPLY_IMP("application/vnd.accpac.simply.imp"),
    @XmlEnumValue("application/vnd.acucobol")
    APPLICATION_VND_ACUCOBOL("application/vnd.acucobol"),
    @XmlEnumValue("application/vnd.acucorp")
    APPLICATION_VND_ACUCORP("application/vnd.acucorp"),
    @XmlEnumValue("application/vnd.adobe.xfdf")
    APPLICATION_VND_ADOBE_XFDF("application/vnd.adobe.xfdf"),
    @XmlEnumValue("application/vnd.aether.imp")
    APPLICATION_VND_AETHER_IMP("application/vnd.aether.imp"),
    @XmlEnumValue("application/vnd.amiga.ami")
    APPLICATION_VND_AMIGA_AMI("application/vnd.amiga.ami"),
    @XmlEnumValue("application/vnd.anser-web-certificate-issue-initiation")
    APPLICATION_VND_ANSER_WEB_CERTIFICATE_ISSUE_INITIATION("application/vnd.anser-web-certificate-issue-initiation"),
    @XmlEnumValue("application/vnd.anser-web-funds-transfer-initiation")
    APPLICATION_VND_ANSER_WEB_FUNDS_TRANSFER_INITIATION("application/vnd.anser-web-funds-transfer-initiation"),
    @XmlEnumValue("application/vnd.audiograph")
    APPLICATION_VND_AUDIOGRAPH("application/vnd.audiograph"),
    @XmlEnumValue("application/vnd.blueice.multipass")
    APPLICATION_VND_BLUEICE_MULTIPASS("application/vnd.blueice.multipass"),
    @XmlEnumValue("application/vnd.bmi")
    APPLICATION_VND_BMI("application/vnd.bmi"),
    @XmlEnumValue("application/vnd.businessobjects")
    APPLICATION_VND_BUSINESSOBJECTS("application/vnd.businessobjects"),
    @XmlEnumValue("application/vnd.canon-cpdl")
    APPLICATION_VND_CANON_CPDL("application/vnd.canon-cpdl"),
    @XmlEnumValue("application/vnd.canon-lips")
    APPLICATION_VND_CANON_LIPS("application/vnd.canon-lips"),
    @XmlEnumValue("application/vnd.cinderella")
    APPLICATION_VND_CINDERELLA("application/vnd.cinderella"),
    @XmlEnumValue("application/vnd.claymore")
    APPLICATION_VND_CLAYMORE("application/vnd.claymore"),
    @XmlEnumValue("application/vnd.commerce-battelle")
    APPLICATION_VND_COMMERCE_BATTELLE("application/vnd.commerce-battelle"),
    @XmlEnumValue("application/vnd.commonspace")
    APPLICATION_VND_COMMONSPACE("application/vnd.commonspace"),
    @XmlEnumValue("application/vnd.contact.cmsg")
    APPLICATION_VND_CONTACT_CMSG("application/vnd.contact.cmsg"),
    @XmlEnumValue("application/vnd.cosmocaller")
    APPLICATION_VND_COSMOCALLER("application/vnd.cosmocaller"),
    @XmlEnumValue("application/vnd.criticaltools.wbs+xml")
    APPLICATION_VND_CRITICALTOOLS_WBS_XML("application/vnd.criticaltools.wbs+xml"),
    @XmlEnumValue("application/vnd.ctc-posml")
    APPLICATION_VND_CTC_POSML("application/vnd.ctc-posml"),
    @XmlEnumValue("application/vnd.cups-postscript")
    APPLICATION_VND_CUPS_POSTSCRIPT("application/vnd.cups-postscript"),
    @XmlEnumValue("application/vnd.cups-raster")
    APPLICATION_VND_CUPS_RASTER("application/vnd.cups-raster"),
    @XmlEnumValue("application/vnd.cups-raw")
    APPLICATION_VND_CUPS_RAW("application/vnd.cups-raw"),
    @XmlEnumValue("application/vnd.curl")
    APPLICATION_VND_CURL("application/vnd.curl"),
    @XmlEnumValue("application/vnd.cybank")
    APPLICATION_VND_CYBANK("application/vnd.cybank"),
    @XmlEnumValue("application/vnd.data-vision.rdz")
    APPLICATION_VND_DATA_VISION_RDZ("application/vnd.data-vision.rdz"),
    @XmlEnumValue("application/vnd.dna")
    APPLICATION_VND_DNA("application/vnd.dna"),
    @XmlEnumValue("application/vnd.dpgraph")
    APPLICATION_VND_DPGRAPH("application/vnd.dpgraph"),
    @XmlEnumValue("application/vnd.dreamfactory")
    APPLICATION_VND_DREAMFACTORY("application/vnd.dreamfactory"),
    @XmlEnumValue("application/vnd.dxr")
    APPLICATION_VND_DXR("application/vnd.dxr"),
    @XmlEnumValue("application/vnd.ecdis-update")
    APPLICATION_VND_ECDIS_UPDATE("application/vnd.ecdis-update"),
    @XmlEnumValue("application/vnd.ecowin.chart")
    APPLICATION_VND_ECOWIN_CHART("application/vnd.ecowin.chart"),
    @XmlEnumValue("application/vnd.ecowin.filerequest")
    APPLICATION_VND_ECOWIN_FILEREQUEST("application/vnd.ecowin.filerequest"),
    @XmlEnumValue("application/vnd.ecowin.fileupdate")
    APPLICATION_VND_ECOWIN_FILEUPDATE("application/vnd.ecowin.fileupdate"),
    @XmlEnumValue("application/vnd.ecowin.series")
    APPLICATION_VND_ECOWIN_SERIES("application/vnd.ecowin.series"),
    @XmlEnumValue("application/vnd.ecowin.seriesrequest")
    APPLICATION_VND_ECOWIN_SERIESREQUEST("application/vnd.ecowin.seriesrequest"),
    @XmlEnumValue("application/vnd.ecowin.seriesupdate")
    APPLICATION_VND_ECOWIN_SERIESUPDATE("application/vnd.ecowin.seriesupdate"),
    @XmlEnumValue("application/vnd.enliven")
    APPLICATION_VND_ENLIVEN("application/vnd.enliven"),
    @XmlEnumValue("application/vnd.epson.esf")
    APPLICATION_VND_EPSON_ESF("application/vnd.epson.esf"),
    @XmlEnumValue("application/vnd.epson.msf")
    APPLICATION_VND_EPSON_MSF("application/vnd.epson.msf"),
    @XmlEnumValue("application/vnd.epson.quickanime")
    APPLICATION_VND_EPSON_QUICKANIME("application/vnd.epson.quickanime"),
    @XmlEnumValue("application/vnd.epson.salt")
    APPLICATION_VND_EPSON_SALT("application/vnd.epson.salt"),
    @XmlEnumValue("application/vnd.epson.ssf")
    APPLICATION_VND_EPSON_SSF("application/vnd.epson.ssf"),
    @XmlEnumValue("application/vnd.ericsson.quickcall")
    APPLICATION_VND_ERICSSON_QUICKCALL("application/vnd.ericsson.quickcall"),
    @XmlEnumValue("application/vnd.eudora.data")
    APPLICATION_VND_EUDORA_DATA("application/vnd.eudora.data"),
    @XmlEnumValue("application/vnd.fdf")
    APPLICATION_VND_FDF("application/vnd.fdf"),
    @XmlEnumValue("application/vnd.ffsns")
    APPLICATION_VND_FFSNS("application/vnd.ffsns"),
    @XmlEnumValue("application/vnd.fints")
    APPLICATION_VND_FINTS("application/vnd.fints"),
    @XmlEnumValue("application/vnd.framemaker")
    APPLICATION_VND_FRAMEMAKER("application/vnd.framemaker"),
    @XmlEnumValue("application/vnd.fsc.weblaunch")
    APPLICATION_VND_FSC_WEBLAUNCH("application/vnd.fsc.weblaunch"),
    @XmlEnumValue("application/vnd.fujitsu.oasys")
    APPLICATION_VND_FUJITSU_OASYS("application/vnd.fujitsu.oasys"),
    @XmlEnumValue("application/vnd.fujitsu.oasys2")
    APPLICATION_VND_FUJITSU_OASYS_2("application/vnd.fujitsu.oasys2"),
    @XmlEnumValue("application/vnd.fujitsu.oasys3")
    APPLICATION_VND_FUJITSU_OASYS_3("application/vnd.fujitsu.oasys3"),
    @XmlEnumValue("application/vnd.fujitsu.oasysgp")
    APPLICATION_VND_FUJITSU_OASYSGP("application/vnd.fujitsu.oasysgp"),
    @XmlEnumValue("application/vnd.fujitsu.oasysprs")
    APPLICATION_VND_FUJITSU_OASYSPRS("application/vnd.fujitsu.oasysprs"),
    @XmlEnumValue("application/vnd.fujixerox.ddd")
    APPLICATION_VND_FUJIXEROX_DDD("application/vnd.fujixerox.ddd"),
    @XmlEnumValue("application/vnd.fujixerox.docuworks")
    APPLICATION_VND_FUJIXEROX_DOCUWORKS("application/vnd.fujixerox.docuworks"),
    @XmlEnumValue("application/vnd.fujixerox.docuworks.binder")
    APPLICATION_VND_FUJIXEROX_DOCUWORKS_BINDER("application/vnd.fujixerox.docuworks.binder"),
    @XmlEnumValue("application/vnd.fut-misnet")
    APPLICATION_VND_FUT_MISNET("application/vnd.fut-misnet"),
    @XmlEnumValue("application/vnd.genomatix.tuxedo")
    APPLICATION_VND_GENOMATIX_TUXEDO("application/vnd.genomatix.tuxedo"),
    @XmlEnumValue("application/vnd.grafeq")
    APPLICATION_VND_GRAFEQ("application/vnd.grafeq"),
    @XmlEnumValue("application/vnd.groove-account")
    APPLICATION_VND_GROOVE_ACCOUNT("application/vnd.groove-account"),
    @XmlEnumValue("application/vnd.groove-help")
    APPLICATION_VND_GROOVE_HELP("application/vnd.groove-help"),
    @XmlEnumValue("application/vnd.groove-identity-message")
    APPLICATION_VND_GROOVE_IDENTITY_MESSAGE("application/vnd.groove-identity-message"),
    @XmlEnumValue("application/vnd.groove-injector")
    APPLICATION_VND_GROOVE_INJECTOR("application/vnd.groove-injector"),
    @XmlEnumValue("application/vnd.groove-tool-message")
    APPLICATION_VND_GROOVE_TOOL_MESSAGE("application/vnd.groove-tool-message"),
    @XmlEnumValue("application/vnd.groove-tool-template")
    APPLICATION_VND_GROOVE_TOOL_TEMPLATE("application/vnd.groove-tool-template"),
    @XmlEnumValue("application/vnd.groove-vcard")
    APPLICATION_VND_GROOVE_VCARD("application/vnd.groove-vcard"),
    @XmlEnumValue("application/vnd.hbci")
    APPLICATION_VND_HBCI("application/vnd.hbci"),
    @XmlEnumValue("application/vnd.hcl-bireports")
    APPLICATION_VND_HCL_BIREPORTS("application/vnd.hcl-bireports"),
    @XmlEnumValue("application/vnd.hhe.lesson-player")
    APPLICATION_VND_HHE_LESSON_PLAYER("application/vnd.hhe.lesson-player"),
    @XmlEnumValue("application/vnd.hp-HPGL")
    APPLICATION_VND_HP_HPGL("application/vnd.hp-HPGL"),
    @XmlEnumValue("application/vnd.hp-PCL")
    APPLICATION_VND_HP_PCL("application/vnd.hp-PCL"),
    @XmlEnumValue("application/vnd.hp-PCLXL")
    APPLICATION_VND_HP_PCLXL("application/vnd.hp-PCLXL"),
    @XmlEnumValue("application/vnd.hp-hpid")
    APPLICATION_VND_HP_HPID("application/vnd.hp-hpid"),
    @XmlEnumValue("application/vnd.hp-hps")
    APPLICATION_VND_HP_HPS("application/vnd.hp-hps"),
    @XmlEnumValue("application/vnd.httphone")
    APPLICATION_VND_HTTPHONE("application/vnd.httphone"),
    @XmlEnumValue("application/vnd.hzn-3d-crossword")
    APPLICATION_VND_HZN_3_D_CROSSWORD("application/vnd.hzn-3d-crossword"),
    @XmlEnumValue("application/vnd.ibm.MiniPay")
    APPLICATION_VND_IBM_MINI_PAY("application/vnd.ibm.MiniPay"),
    @XmlEnumValue("application/vnd.ibm.afplinedata")
    APPLICATION_VND_IBM_AFPLINEDATA("application/vnd.ibm.afplinedata"),
    @XmlEnumValue("application/vnd.ibm.electronic-media")
    APPLICATION_VND_IBM_ELECTRONIC_MEDIA("application/vnd.ibm.electronic-media"),
    @XmlEnumValue("application/vnd.ibm.modcap")
    APPLICATION_VND_IBM_MODCAP("application/vnd.ibm.modcap"),
    @XmlEnumValue("application/vnd.ibm.rights-management")
    APPLICATION_VND_IBM_RIGHTS_MANAGEMENT("application/vnd.ibm.rights-management"),
    @XmlEnumValue("application/vnd.ibm.secure-container")
    APPLICATION_VND_IBM_SECURE_CONTAINER("application/vnd.ibm.secure-container"),
    @XmlEnumValue("application/vnd.informix-visionary")
    APPLICATION_VND_INFORMIX_VISIONARY("application/vnd.informix-visionary"),
    @XmlEnumValue("application/vnd.intercon.formnet")
    APPLICATION_VND_INTERCON_FORMNET("application/vnd.intercon.formnet"),
    @XmlEnumValue("application/vnd.intertrust.digibox")
    APPLICATION_VND_INTERTRUST_DIGIBOX("application/vnd.intertrust.digibox"),
    @XmlEnumValue("application/vnd.intertrust.nncp")
    APPLICATION_VND_INTERTRUST_NNCP("application/vnd.intertrust.nncp"),
    @XmlEnumValue("application/vnd.intu.qbo")
    APPLICATION_VND_INTU_QBO("application/vnd.intu.qbo"),
    @XmlEnumValue("application/vnd.intu.qfx")
    APPLICATION_VND_INTU_QFX("application/vnd.intu.qfx"),
    @XmlEnumValue("application/vnd.ipunplugged.rcprofile")
    APPLICATION_VND_IPUNPLUGGED_RCPROFILE("application/vnd.ipunplugged.rcprofile"),
    @XmlEnumValue("application/vnd.irepository.package+xml")
    APPLICATION_VND_IREPOSITORY_PACKAGE_XML("application/vnd.irepository.package+xml"),
    @XmlEnumValue("application/vnd.is-xpr")
    APPLICATION_VND_IS_XPR("application/vnd.is-xpr"),
    @XmlEnumValue("application/vnd.japannet-directory-service")
    APPLICATION_VND_JAPANNET_DIRECTORY_SERVICE("application/vnd.japannet-directory-service"),
    @XmlEnumValue("application/vnd.japannet-jpnstore-wakeup")
    APPLICATION_VND_JAPANNET_JPNSTORE_WAKEUP("application/vnd.japannet-jpnstore-wakeup"),
    @XmlEnumValue("application/vnd.japannet-payment-wakeup")
    APPLICATION_VND_JAPANNET_PAYMENT_WAKEUP("application/vnd.japannet-payment-wakeup"),
    @XmlEnumValue("application/vnd.japannet-registration")
    APPLICATION_VND_JAPANNET_REGISTRATION("application/vnd.japannet-registration"),
    @XmlEnumValue("application/vnd.japannet-registration-wakeup")
    APPLICATION_VND_JAPANNET_REGISTRATION_WAKEUP("application/vnd.japannet-registration-wakeup"),
    @XmlEnumValue("application/vnd.japannet-setstore-wakeup")
    APPLICATION_VND_JAPANNET_SETSTORE_WAKEUP("application/vnd.japannet-setstore-wakeup"),
    @XmlEnumValue("application/vnd.japannet-verification")
    APPLICATION_VND_JAPANNET_VERIFICATION("application/vnd.japannet-verification"),
    @XmlEnumValue("application/vnd.japannet-verification-wakeup")
    APPLICATION_VND_JAPANNET_VERIFICATION_WAKEUP("application/vnd.japannet-verification-wakeup"),
    @XmlEnumValue("application/vnd.jisp")
    APPLICATION_VND_JISP("application/vnd.jisp"),
    @XmlEnumValue("application/vnd.kde.karbon")
    APPLICATION_VND_KDE_KARBON("application/vnd.kde.karbon"),
    @XmlEnumValue("application/vnd.kde.kchart")
    APPLICATION_VND_KDE_KCHART("application/vnd.kde.kchart"),
    @XmlEnumValue("application/vnd.kde.kformula")
    APPLICATION_VND_KDE_KFORMULA("application/vnd.kde.kformula"),
    @XmlEnumValue("application/vnd.kde.kivio")
    APPLICATION_VND_KDE_KIVIO("application/vnd.kde.kivio"),
    @XmlEnumValue("application/vnd.kde.kontour")
    APPLICATION_VND_KDE_KONTOUR("application/vnd.kde.kontour"),
    @XmlEnumValue("application/vnd.kde.kpresenter")
    APPLICATION_VND_KDE_KPRESENTER("application/vnd.kde.kpresenter"),
    @XmlEnumValue("application/vnd.kde.kspread")
    APPLICATION_VND_KDE_KSPREAD("application/vnd.kde.kspread"),
    @XmlEnumValue("application/vnd.kde.kword")
    APPLICATION_VND_KDE_KWORD("application/vnd.kde.kword"),
    @XmlEnumValue("application/vnd.kenameaapp")
    APPLICATION_VND_KENAMEAAPP("application/vnd.kenameaapp"),
    @XmlEnumValue("application/vnd.kidspiration")
    APPLICATION_VND_KIDSPIRATION("application/vnd.kidspiration"),
    @XmlEnumValue("application/vnd.koan")
    APPLICATION_VND_KOAN("application/vnd.koan"),
    @XmlEnumValue("application/vnd.liberty-request+xml")
    APPLICATION_VND_LIBERTY_REQUEST_XML("application/vnd.liberty-request+xml"),
    @XmlEnumValue("application/vnd.llamagraphics.life-balance.desktop")
    APPLICATION_VND_LLAMAGRAPHICS_LIFE_BALANCE_DESKTOP("application/vnd.llamagraphics.life-balance.desktop"),
    @XmlEnumValue("application/vnd.llamagraphics.life-balance.exchange+xml")
    APPLICATION_VND_LLAMAGRAPHICS_LIFE_BALANCE_EXCHANGE_XML("application/vnd.llamagraphics.life-balance.exchange+xml"),
    @XmlEnumValue("application/vnd.lotus-1-2-3")
    APPLICATION_VND_LOTUS_1_2_3("application/vnd.lotus-1-2-3"),
    @XmlEnumValue("application/vnd.lotus-approach")
    APPLICATION_VND_LOTUS_APPROACH("application/vnd.lotus-approach"),
    @XmlEnumValue("application/vnd.lotus-freelance")
    APPLICATION_VND_LOTUS_FREELANCE("application/vnd.lotus-freelance"),
    @XmlEnumValue("application/vnd.lotus-notes")
    APPLICATION_VND_LOTUS_NOTES("application/vnd.lotus-notes"),
    @XmlEnumValue("application/vnd.lotus-organizer")
    APPLICATION_VND_LOTUS_ORGANIZER("application/vnd.lotus-organizer"),
    @XmlEnumValue("application/vnd.lotus-screencam")
    APPLICATION_VND_LOTUS_SCREENCAM("application/vnd.lotus-screencam"),
    @XmlEnumValue("application/vnd.lotus-wordpro")
    APPLICATION_VND_LOTUS_WORDPRO("application/vnd.lotus-wordpro"),
    @XmlEnumValue("application/vnd.mcd")
    APPLICATION_VND_MCD("application/vnd.mcd"),
    @XmlEnumValue("application/vnd.mediastation.cdkey")
    APPLICATION_VND_MEDIASTATION_CDKEY("application/vnd.mediastation.cdkey"),
    @XmlEnumValue("application/vnd.meridian-slingshot")
    APPLICATION_VND_MERIDIAN_SLINGSHOT("application/vnd.meridian-slingshot"),
    @XmlEnumValue("application/vnd.mfmp")
    APPLICATION_VND_MFMP("application/vnd.mfmp"),
    @XmlEnumValue("application/vnd.micrografx.flo")
    APPLICATION_VND_MICROGRAFX_FLO("application/vnd.micrografx.flo"),
    @XmlEnumValue("application/vnd.micrografx.igx")
    APPLICATION_VND_MICROGRAFX_IGX("application/vnd.micrografx.igx"),
    @XmlEnumValue("application/vnd.mif")
    APPLICATION_VND_MIF("application/vnd.mif"),
    @XmlEnumValue("application/vnd.minisoft-hp3000-save")
    APPLICATION_VND_MINISOFT_HP_3000_SAVE("application/vnd.minisoft-hp3000-save"),
    @XmlEnumValue("application/vnd.mitsubishi.misty-guard.trustweb")
    APPLICATION_VND_MITSUBISHI_MISTY_GUARD_TRUSTWEB("application/vnd.mitsubishi.misty-guard.trustweb"),
    @XmlEnumValue("application/vnd.mophun.application")
    APPLICATION_VND_MOPHUN_APPLICATION("application/vnd.mophun.application"),
    @XmlEnumValue("application/vnd.mophun.certificate")
    APPLICATION_VND_MOPHUN_CERTIFICATE("application/vnd.mophun.certificate"),
    @XmlEnumValue("application/vnd.motorola.flexsuite")
    APPLICATION_VND_MOTOROLA_FLEXSUITE("application/vnd.motorola.flexsuite"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.adsi")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_ADSI("application/vnd.motorola.flexsuite.adsi"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.fis")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_FIS("application/vnd.motorola.flexsuite.fis"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.gotap")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_GOTAP("application/vnd.motorola.flexsuite.gotap"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.kmr")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_KMR("application/vnd.motorola.flexsuite.kmr"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.ttc")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_TTC("application/vnd.motorola.flexsuite.ttc"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.wem")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_WEM("application/vnd.motorola.flexsuite.wem"),
    @XmlEnumValue("application/vnd.mozilla.xul+xml")
    APPLICATION_VND_MOZILLA_XUL_XML("application/vnd.mozilla.xul+xml"),
    @XmlEnumValue("application/vnd.ms-artgalry")
    APPLICATION_VND_MS_ARTGALRY("application/vnd.ms-artgalry"),
    @XmlEnumValue("application/vnd.ms-asf")
    APPLICATION_VND_MS_ASF("application/vnd.ms-asf"),
    @XmlEnumValue("application/vnd.ms-excel")
    APPLICATION_VND_MS_EXCEL("application/vnd.ms-excel"),
    @XmlEnumValue("application/vnd.ms-lrm")
    APPLICATION_VND_MS_LRM("application/vnd.ms-lrm"),
    @XmlEnumValue("application/vnd.ms-powerpoint")
    APPLICATION_VND_MS_POWERPOINT("application/vnd.ms-powerpoint"),
    @XmlEnumValue("application/vnd.ms-project")
    APPLICATION_VND_MS_PROJECT("application/vnd.ms-project"),
    @XmlEnumValue("application/vnd.ms-tnef")
    APPLICATION_VND_MS_TNEF("application/vnd.ms-tnef"),
    @XmlEnumValue("application/vnd.ms-works")
    APPLICATION_VND_MS_WORKS("application/vnd.ms-works"),
    @XmlEnumValue("application/vnd.ms-wpl")
    APPLICATION_VND_MS_WPL("application/vnd.ms-wpl"),
    @XmlEnumValue("application/vnd.mseq")
    APPLICATION_VND_MSEQ("application/vnd.mseq"),
    @XmlEnumValue("application/vnd.msign")
    APPLICATION_VND_MSIGN("application/vnd.msign"),
    @XmlEnumValue("application/vnd.music-niff")
    APPLICATION_VND_MUSIC_NIFF("application/vnd.music-niff"),
    @XmlEnumValue("application/vnd.musician")
    APPLICATION_VND_MUSICIAN("application/vnd.musician"),
    @XmlEnumValue("application/vnd.nervana")
    APPLICATION_VND_NERVANA("application/vnd.nervana"),
    @XmlEnumValue("application/vnd.netfpx")
    APPLICATION_VND_NETFPX("application/vnd.netfpx"),
    @XmlEnumValue("application/vnd.noblenet-directory")
    APPLICATION_VND_NOBLENET_DIRECTORY("application/vnd.noblenet-directory"),
    @XmlEnumValue("application/vnd.noblenet-sealer")
    APPLICATION_VND_NOBLENET_SEALER("application/vnd.noblenet-sealer"),
    @XmlEnumValue("application/vnd.noblenet-web")
    APPLICATION_VND_NOBLENET_WEB("application/vnd.noblenet-web"),
    @XmlEnumValue("application/vnd.nokia.landmark+wbxml")
    APPLICATION_VND_NOKIA_LANDMARK_WBXML("application/vnd.nokia.landmark+wbxml"),
    @XmlEnumValue("application/vnd.nokia.landmark+xml")
    APPLICATION_VND_NOKIA_LANDMARK_XML("application/vnd.nokia.landmark+xml"),
    @XmlEnumValue("application/vnd.nokia.landmarkcollection+xml")
    APPLICATION_VND_NOKIA_LANDMARKCOLLECTION_XML("application/vnd.nokia.landmarkcollection+xml"),
    @XmlEnumValue("application/vnd.nokia.radio-preset")
    APPLICATION_VND_NOKIA_RADIO_PRESET("application/vnd.nokia.radio-preset"),
    @XmlEnumValue("application/vnd.nokia.radio-presets")
    APPLICATION_VND_NOKIA_RADIO_PRESETS("application/vnd.nokia.radio-presets"),
    @XmlEnumValue("application/vnd.novadigm.EDM")
    APPLICATION_VND_NOVADIGM_EDM("application/vnd.novadigm.EDM"),
    @XmlEnumValue("application/vnd.novadigm.EDX")
    APPLICATION_VND_NOVADIGM_EDX("application/vnd.novadigm.EDX"),
    @XmlEnumValue("application/vnd.novadigm.EXT")
    APPLICATION_VND_NOVADIGM_EXT("application/vnd.novadigm.EXT"),
    @XmlEnumValue("application/vnd.obn")
    APPLICATION_VND_OBN("application/vnd.obn"),
    @XmlEnumValue("application/vnd.omads-email+xml")
    APPLICATION_VND_OMADS_EMAIL_XML("application/vnd.omads-email+xml"),
    @XmlEnumValue("application/vnd.omads-file+xml")
    APPLICATION_VND_OMADS_FILE_XML("application/vnd.omads-file+xml"),
    @XmlEnumValue("application/vnd.omads-folder+xml")
    APPLICATION_VND_OMADS_FOLDER_XML("application/vnd.omads-folder+xml"),
    @XmlEnumValue("application/vnd.osa.netdeploy")
    APPLICATION_VND_OSA_NETDEPLOY("application/vnd.osa.netdeploy"),
    @XmlEnumValue("application/vnd.palm")
    APPLICATION_VND_PALM("application/vnd.palm"),
    @XmlEnumValue("application/vnd.paos.xml")
    APPLICATION_VND_PAOS_XML("application/vnd.paos.xml"),
    @XmlEnumValue("application/vnd.pg.format")
    APPLICATION_VND_PG_FORMAT("application/vnd.pg.format"),
    @XmlEnumValue("application/vnd.pg.osasli")
    APPLICATION_VND_PG_OSASLI("application/vnd.pg.osasli"),
    @XmlEnumValue("application/vnd.picsel")
    APPLICATION_VND_PICSEL("application/vnd.picsel"),
    @XmlEnumValue("application/vnd.powerbuilder6")
    APPLICATION_VND_POWERBUILDER_6("application/vnd.powerbuilder6"),
    @XmlEnumValue("application/vnd.powerbuilder6-s")
    APPLICATION_VND_POWERBUILDER_6_S("application/vnd.powerbuilder6-s"),
    @XmlEnumValue("application/vnd.powerbuilder7")
    APPLICATION_VND_POWERBUILDER_7("application/vnd.powerbuilder7"),
    @XmlEnumValue("application/vnd.powerbuilder7-s")
    APPLICATION_VND_POWERBUILDER_7_S("application/vnd.powerbuilder7-s"),
    @XmlEnumValue("application/vnd.powerbuilder75")
    APPLICATION_VND_POWERBUILDER_75("application/vnd.powerbuilder75"),
    @XmlEnumValue("application/vnd.powerbuilder75-s")
    APPLICATION_VND_POWERBUILDER_75_S("application/vnd.powerbuilder75-s"),
    @XmlEnumValue("application/vnd.previewsystems.box")
    APPLICATION_VND_PREVIEWSYSTEMS_BOX("application/vnd.previewsystems.box"),
    @XmlEnumValue("application/vnd.publishare-delta-tree")
    APPLICATION_VND_PUBLISHARE_DELTA_TREE("application/vnd.publishare-delta-tree"),
    @XmlEnumValue("application/vnd.pvi.ptid1")
    APPLICATION_VND_PVI_PTID_1("application/vnd.pvi.ptid1"),
    @XmlEnumValue("application/vnd.pwg-multiplexed")
    APPLICATION_VND_PWG_MULTIPLEXED("application/vnd.pwg-multiplexed"),
    @XmlEnumValue("application/vnd.pwg-xhtml-print+xml")
    APPLICATION_VND_PWG_XHTML_PRINT_XML("application/vnd.pwg-xhtml-print+xml"),
    @XmlEnumValue("application/vnd.rapid")
    APPLICATION_VND_RAPID("application/vnd.rapid"),
    @XmlEnumValue("application/vnd.s3sms")
    APPLICATION_VND_S_3_SMS("application/vnd.s3sms"),
    @XmlEnumValue("application/vnd.sealed.doc")
    APPLICATION_VND_SEALED_DOC("application/vnd.sealed.doc"),
    @XmlEnumValue("application/vnd.sealed.eml")
    APPLICATION_VND_SEALED_EML("application/vnd.sealed.eml"),
    @XmlEnumValue("application/vnd.sealed.mht")
    APPLICATION_VND_SEALED_MHT("application/vnd.sealed.mht"),
    @XmlEnumValue("application/vnd.sealed.net")
    APPLICATION_VND_SEALED_NET("application/vnd.sealed.net"),
    @XmlEnumValue("application/vnd.sealed.ppt")
    APPLICATION_VND_SEALED_PPT("application/vnd.sealed.ppt"),
    @XmlEnumValue("application/vnd.sealed.xls")
    APPLICATION_VND_SEALED_XLS("application/vnd.sealed.xls"),
    @XmlEnumValue("application/vnd.sealedmedia.softseal.html")
    APPLICATION_VND_SEALEDMEDIA_SOFTSEAL_HTML("application/vnd.sealedmedia.softseal.html"),
    @XmlEnumValue("application/vnd.sealedmedia.softseal.pdf")
    APPLICATION_VND_SEALEDMEDIA_SOFTSEAL_PDF("application/vnd.sealedmedia.softseal.pdf"),
    @XmlEnumValue("application/vnd.seemail")
    APPLICATION_VND_SEEMAIL("application/vnd.seemail"),
    @XmlEnumValue("application/vnd.shana.informed.formdata")
    APPLICATION_VND_SHANA_INFORMED_FORMDATA("application/vnd.shana.informed.formdata"),
    @XmlEnumValue("application/vnd.shana.informed.formtemplate")
    APPLICATION_VND_SHANA_INFORMED_FORMTEMPLATE("application/vnd.shana.informed.formtemplate"),
    @XmlEnumValue("application/vnd.shana.informed.interchange")
    APPLICATION_VND_SHANA_INFORMED_INTERCHANGE("application/vnd.shana.informed.interchange"),
    @XmlEnumValue("application/vnd.shana.informed.package")
    APPLICATION_VND_SHANA_INFORMED_PACKAGE("application/vnd.shana.informed.package"),
    @XmlEnumValue("application/vnd.smaf")
    APPLICATION_VND_SMAF("application/vnd.smaf"),
    @XmlEnumValue("application/vnd.sss-cod")
    APPLICATION_VND_SSS_COD("application/vnd.sss-cod"),
    @XmlEnumValue("application/vnd.sss-dtf")
    APPLICATION_VND_SSS_DTF("application/vnd.sss-dtf"),
    @XmlEnumValue("application/vnd.sss-ntf")
    APPLICATION_VND_SSS_NTF("application/vnd.sss-ntf"),
    @XmlEnumValue("application/vnd.street-stream")
    APPLICATION_VND_STREET_STREAM("application/vnd.street-stream"),
    @XmlEnumValue("application/vnd.sus-calendar")
    APPLICATION_VND_SUS_CALENDAR("application/vnd.sus-calendar"),
    @XmlEnumValue("application/vnd.svd")
    APPLICATION_VND_SVD("application/vnd.svd"),
    @XmlEnumValue("application/vnd.swiftview-ics")
    APPLICATION_VND_SWIFTVIEW_ICS("application/vnd.swiftview-ics"),
    @XmlEnumValue("application/vnd.syncml.+xml")
    APPLICATION_VND_SYNCML_XML("application/vnd.syncml.+xml"),
    @XmlEnumValue("application/vnd.syncml.ds.notification")
    APPLICATION_VND_SYNCML_DS_NOTIFICATION("application/vnd.syncml.ds.notification"),
    @XmlEnumValue("application/vnd.triscape.mxs")
    APPLICATION_VND_TRISCAPE_MXS("application/vnd.triscape.mxs"),
    @XmlEnumValue("application/vnd.trueapp")
    APPLICATION_VND_TRUEAPP("application/vnd.trueapp"),
    @XmlEnumValue("application/vnd.truedoc")
    APPLICATION_VND_TRUEDOC("application/vnd.truedoc"),
    @XmlEnumValue("application/vnd.ufdl")
    APPLICATION_VND_UFDL("application/vnd.ufdl"),
    @XmlEnumValue("application/vnd.uiq.theme")
    APPLICATION_VND_UIQ_THEME("application/vnd.uiq.theme"),
    @XmlEnumValue("application/vnd.uplanet.alert")
    APPLICATION_VND_UPLANET_ALERT("application/vnd.uplanet.alert"),
    @XmlEnumValue("application/vnd.uplanet.alert-wbxml")
    APPLICATION_VND_UPLANET_ALERT_WBXML("application/vnd.uplanet.alert-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.bearer-choice")
    APPLICATION_VND_UPLANET_BEARER_CHOICE("application/vnd.uplanet.bearer-choice"),
    @XmlEnumValue("application/vnd.uplanet.bearer-choice-wbxml")
    APPLICATION_VND_UPLANET_BEARER_CHOICE_WBXML("application/vnd.uplanet.bearer-choice-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.cacheop")
    APPLICATION_VND_UPLANET_CACHEOP("application/vnd.uplanet.cacheop"),
    @XmlEnumValue("application/vnd.uplanet.cacheop-wbxml")
    APPLICATION_VND_UPLANET_CACHEOP_WBXML("application/vnd.uplanet.cacheop-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.channel")
    APPLICATION_VND_UPLANET_CHANNEL("application/vnd.uplanet.channel"),
    @XmlEnumValue("application/vnd.uplanet.channel-wbxml")
    APPLICATION_VND_UPLANET_CHANNEL_WBXML("application/vnd.uplanet.channel-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.list")
    APPLICATION_VND_UPLANET_LIST("application/vnd.uplanet.list"),
    @XmlEnumValue("application/vnd.uplanet.list-wbxml")
    APPLICATION_VND_UPLANET_LIST_WBXML("application/vnd.uplanet.list-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.listcmd")
    APPLICATION_VND_UPLANET_LISTCMD("application/vnd.uplanet.listcmd"),
    @XmlEnumValue("application/vnd.uplanet.listcmd-wbxml")
    APPLICATION_VND_UPLANET_LISTCMD_WBXML("application/vnd.uplanet.listcmd-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.signal")
    APPLICATION_VND_UPLANET_SIGNAL("application/vnd.uplanet.signal"),
    @XmlEnumValue("application/vnd.vcx")
    APPLICATION_VND_VCX("application/vnd.vcx"),
    @XmlEnumValue("application/vnd.vectorworks")
    APPLICATION_VND_VECTORWORKS("application/vnd.vectorworks"),
    @XmlEnumValue("application/vnd.vidsoft.vidconference")
    APPLICATION_VND_VIDSOFT_VIDCONFERENCE("application/vnd.vidsoft.vidconference"),
    @XmlEnumValue("application/vnd.visio")
    APPLICATION_VND_VISIO("application/vnd.visio"),
    @XmlEnumValue("application/vnd.visionary")
    APPLICATION_VND_VISIONARY("application/vnd.visionary"),
    @XmlEnumValue("application/vnd.vividence.scriptfile")
    APPLICATION_VND_VIVIDENCE_SCRIPTFILE("application/vnd.vividence.scriptfile"),
    @XmlEnumValue("application/vnd.vsf")
    APPLICATION_VND_VSF("application/vnd.vsf"),
    @XmlEnumValue("application/vnd.wap.sic")
    APPLICATION_VND_WAP_SIC("application/vnd.wap.sic"),
    @XmlEnumValue("application/vnd.wap.slc")
    APPLICATION_VND_WAP_SLC("application/vnd.wap.slc"),
    @XmlEnumValue("application/vnd.wap.wbxml")
    APPLICATION_VND_WAP_WBXML("application/vnd.wap.wbxml"),
    @XmlEnumValue("application/vnd.wap.wmlc")
    APPLICATION_VND_WAP_WMLC("application/vnd.wap.wmlc"),
    @XmlEnumValue("application/vnd.wap.wmlscriptc")
    APPLICATION_VND_WAP_WMLSCRIPTC("application/vnd.wap.wmlscriptc"),
    @XmlEnumValue("application/vnd.webturbo")
    APPLICATION_VND_WEBTURBO("application/vnd.webturbo"),
    @XmlEnumValue("application/vnd.wordperfect")
    APPLICATION_VND_WORDPERFECT("application/vnd.wordperfect"),
    @XmlEnumValue("application/vnd.wqd")
    APPLICATION_VND_WQD("application/vnd.wqd"),
    @XmlEnumValue("application/vnd.wrq-hp3000-labelled")
    APPLICATION_VND_WRQ_HP_3000_LABELLED("application/vnd.wrq-hp3000-labelled"),
    @XmlEnumValue("application/vnd.wt.stf")
    APPLICATION_VND_WT_STF("application/vnd.wt.stf"),
    @XmlEnumValue("application/vnd.wv.csp+wbxml")
    APPLICATION_VND_WV_CSP_WBXML("application/vnd.wv.csp+wbxml"),
    @XmlEnumValue("application/vnd.wv.csp+xml")
    APPLICATION_VND_WV_CSP_XML("application/vnd.wv.csp+xml"),
    @XmlEnumValue("application/vnd.wv.ssp+xml")
    APPLICATION_VND_WV_SSP_XML("application/vnd.wv.ssp+xml"),
    @XmlEnumValue("application/vnd.xara")
    APPLICATION_VND_XARA("application/vnd.xara"),
    @XmlEnumValue("application/vnd.xfdl")
    APPLICATION_VND_XFDL("application/vnd.xfdl"),
    @XmlEnumValue("application/vnd.yamaha.hv-dic")
    APPLICATION_VND_YAMAHA_HV_DIC("application/vnd.yamaha.hv-dic"),
    @XmlEnumValue("application/vnd.yamaha.hv-script")
    APPLICATION_VND_YAMAHA_HV_SCRIPT("application/vnd.yamaha.hv-script"),
    @XmlEnumValue("application/vnd.yamaha.hv-voice")
    APPLICATION_VND_YAMAHA_HV_VOICE("application/vnd.yamaha.hv-voice"),
    @XmlEnumValue("application/vnd.yamaha.smaf-audio")
    APPLICATION_VND_YAMAHA_SMAF_AUDIO("application/vnd.yamaha.smaf-audio"),
    @XmlEnumValue("application/vnd.yamaha.smaf-phrase")
    APPLICATION_VND_YAMAHA_SMAF_PHRASE("application/vnd.yamaha.smaf-phrase"),
    @XmlEnumValue("application/vnd.yellowriver-custom-menu")
    APPLICATION_VND_YELLOWRIVER_CUSTOM_MENU("application/vnd.yellowriver-custom-menu"),
    @XmlEnumValue("application/watcherinfo+xml")
    APPLICATION_WATCHERINFO_XML("application/watcherinfo+xml"),
    @XmlEnumValue("application/whoispp-query")
    APPLICATION_WHOISPP_QUERY("application/whoispp-query"),
    @XmlEnumValue("application/whoispp-response")
    APPLICATION_WHOISPP_RESPONSE("application/whoispp-response"),
    @XmlEnumValue("application/wita")
    APPLICATION_WITA("application/wita"),
    @XmlEnumValue("application/wordperfect5.1")
    APPLICATION_WORDPERFECT_5_1("application/wordperfect5.1"),
    @XmlEnumValue("application/x400-bp")
    APPLICATION_X_400_BP("application/x400-bp"),
    @XmlEnumValue("application/xhtml+xml")
    APPLICATION_XHTML_XML("application/xhtml+xml"),
    @XmlEnumValue("application/xml")
    APPLICATION_XML("application/xml"),
    @XmlEnumValue("application/xml-dtd")
    APPLICATION_XML_DTD("application/xml-dtd"),
    @XmlEnumValue("application/xml-external-parsed-entity")
    APPLICATION_XML_EXTERNAL_PARSED_ENTITY("application/xml-external-parsed-entity"),
    @XmlEnumValue("application/xmpp+xml")
    APPLICATION_XMPP_XML("application/xmpp+xml"),
    @XmlEnumValue("application/xop+xml")
    APPLICATION_XOP_XML("application/xop+xml"),
    @XmlEnumValue("application/zip")
    APPLICATION_ZIP("application/zip"),
    @XmlEnumValue("audio/32kadpcm")
    AUDIO_32_KADPCM("audio/32kadpcm"),
    @XmlEnumValue("audio/3gpp")
    AUDIO_3_GPP("audio/3gpp"),
    @XmlEnumValue("audio/AMR")
    AUDIO_AMR("audio/AMR"),
    @XmlEnumValue("audio/AMR-WB")
    AUDIO_AMR_WB("audio/AMR-WB"),
    @XmlEnumValue("audio/BV16")
    AUDIO_BV_16("audio/BV16"),
    @XmlEnumValue("audio/BV32")
    AUDIO_BV_32("audio/BV32"),
    @XmlEnumValue("audio/CN")
    AUDIO_CN("audio/CN"),
    @XmlEnumValue("audio/DAT12")
    AUDIO_DAT_12("audio/DAT12"),
    @XmlEnumValue("audio/DVI4")
    AUDIO_DVI_4("audio/DVI4"),
    @XmlEnumValue("audio/EVRC")
    AUDIO_EVRC("audio/EVRC"),
    @XmlEnumValue("audio/EVRC-QCP")
    AUDIO_EVRC_QCP("audio/EVRC-QCP"),
    @XmlEnumValue("audio/EVRC0")
    AUDIO_EVRC_0("audio/EVRC0"),
    @XmlEnumValue("audio/G.722.1")
    AUDIO_G_722_1("audio/G.722.1"),
    @XmlEnumValue("audio/G722")
    AUDIO_G_722("audio/G722"),
    @XmlEnumValue("audio/G723")
    AUDIO_G_723("audio/G723"),
    @XmlEnumValue("audio/G726-16")
    AUDIO_G_726_16("audio/G726-16"),
    @XmlEnumValue("audio/G726-24")
    AUDIO_G_726_24("audio/G726-24"),
    @XmlEnumValue("audio/G726-32")
    AUDIO_G_726_32("audio/G726-32"),
    @XmlEnumValue("audio/G726-40")
    AUDIO_G_726_40("audio/G726-40"),
    @XmlEnumValue("audio/G728")
    AUDIO_G_728("audio/G728"),
    @XmlEnumValue("audio/G729")
    AUDIO_G_729("audio/G729"),
    @XmlEnumValue("audio/G729D")
    AUDIO_G_729_D("audio/G729D"),
    @XmlEnumValue("audio/G729E")
    AUDIO_G_729_E("audio/G729E"),
    @XmlEnumValue("audio/GSM")
    AUDIO_GSM("audio/GSM"),
    @XmlEnumValue("audio/GSM-EFR")
    AUDIO_GSM_EFR("audio/GSM-EFR"),
    @XmlEnumValue("audio/L16")
    AUDIO_L_16("audio/L16"),
    @XmlEnumValue("audio/L20")
    AUDIO_L_20("audio/L20"),
    @XmlEnumValue("audio/L24")
    AUDIO_L_24("audio/L24"),
    @XmlEnumValue("audio/L8")
    AUDIO_L_8("audio/L8"),
    @XmlEnumValue("audio/LPC")
    AUDIO_LPC("audio/LPC"),
    @XmlEnumValue("audio/MP4A-LATM")
    AUDIO_MP_4_A_LATM("audio/MP4A-LATM"),
    @XmlEnumValue("audio/MPA")
    AUDIO_MPA("audio/MPA"),
    @XmlEnumValue("audio/PCMA")
    AUDIO_PCMA("audio/PCMA"),
    @XmlEnumValue("audio/PCMU")
    AUDIO_PCMU("audio/PCMU"),
    @XmlEnumValue("audio/QCELP")
    AUDIO_QCELP("audio/QCELP"),
    @XmlEnumValue("audio/RED")
    AUDIO_RED("audio/RED"),
    @XmlEnumValue("audio/SMV")
    AUDIO_SMV("audio/SMV"),
    @XmlEnumValue("audio/SMV-QCP")
    AUDIO_SMV_QCP("audio/SMV-QCP"),
    @XmlEnumValue("audio/SMV0")
    AUDIO_SMV_0("audio/SMV0"),
    @XmlEnumValue("audio/VDVI")
    AUDIO_VDVI("audio/VDVI"),
    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),
    @XmlEnumValue("audio/clearmode")
    AUDIO_CLEARMODE("audio/clearmode"),
    @XmlEnumValue("audio/dsr-es201108")
    AUDIO_DSR_ES_201108("audio/dsr-es201108"),
    @XmlEnumValue("audio/dsr-es202050")
    AUDIO_DSR_ES_202050("audio/dsr-es202050"),
    @XmlEnumValue("audio/dsr-es202211")
    AUDIO_DSR_ES_202211("audio/dsr-es202211"),
    @XmlEnumValue("audio/dsr-es202212")
    AUDIO_DSR_ES_202212("audio/dsr-es202212"),
    @XmlEnumValue("audio/iLBC")
    AUDIO_I_LBC("audio/iLBC"),
    @XmlEnumValue("audio/mpa-robust")
    AUDIO_MPA_ROBUST("audio/mpa-robust"),
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg"),
    @XmlEnumValue("audio/mpeg4-generic")
    AUDIO_MPEG_4_GENERIC("audio/mpeg4-generic"),
    @XmlEnumValue("audio/parityfec")
    AUDIO_PARITYFEC("audio/parityfec"),
    @XmlEnumValue("audio/prs.sid")
    AUDIO_PRS_SID("audio/prs.sid"),
    @XmlEnumValue("audio/telephone-event")
    AUDIO_TELEPHONE_EVENT("audio/telephone-event"),
    @XmlEnumValue("audio/tone")
    AUDIO_TONE("audio/tone"),
    @XmlEnumValue("audio/vnd.3gpp.iufp")
    AUDIO_VND_3_GPP_IUFP("audio/vnd.3gpp.iufp"),
    @XmlEnumValue("audio/vnd.audiokoz")
    AUDIO_VND_AUDIOKOZ("audio/vnd.audiokoz"),
    @XmlEnumValue("audio/vnd.cisco.nse")
    AUDIO_VND_CISCO_NSE("audio/vnd.cisco.nse"),
    @XmlEnumValue("audio/vnd.cns.anp1")
    AUDIO_VND_CNS_ANP_1("audio/vnd.cns.anp1"),
    @XmlEnumValue("audio/vnd.cns.inf1")
    AUDIO_VND_CNS_INF_1("audio/vnd.cns.inf1"),
    @XmlEnumValue("audio/vnd.digital-winds")
    AUDIO_VND_DIGITAL_WINDS("audio/vnd.digital-winds"),
    @XmlEnumValue("audio/vnd.everad.plj")
    AUDIO_VND_EVERAD_PLJ("audio/vnd.everad.plj"),
    @XmlEnumValue("audio/vnd.lucent.voice")
    AUDIO_VND_LUCENT_VOICE("audio/vnd.lucent.voice"),
    @XmlEnumValue("audio/vnd.nokia.mobile-xmf")
    AUDIO_VND_NOKIA_MOBILE_XMF("audio/vnd.nokia.mobile-xmf"),
    @XmlEnumValue("audio/vnd.nortel.vbk")
    AUDIO_VND_NORTEL_VBK("audio/vnd.nortel.vbk"),
    @XmlEnumValue("audio/vnd.nuera.ecelp4800")
    AUDIO_VND_NUERA_ECELP_4800("audio/vnd.nuera.ecelp4800"),
    @XmlEnumValue("audio/vnd.nuera.ecelp7470")
    AUDIO_VND_NUERA_ECELP_7470("audio/vnd.nuera.ecelp7470"),
    @XmlEnumValue("audio/vnd.nuera.ecelp9600")
    AUDIO_VND_NUERA_ECELP_9600("audio/vnd.nuera.ecelp9600"),
    @XmlEnumValue("audio/vnd.octel.sbc")
    AUDIO_VND_OCTEL_SBC("audio/vnd.octel.sbc"),
    @XmlEnumValue("audio/vnd.qcelp")
    AUDIO_VND_QCELP("audio/vnd.qcelp"),
    @XmlEnumValue("audio/vnd.rhetorex.32kadpcm")
    AUDIO_VND_RHETOREX_32_KADPCM("audio/vnd.rhetorex.32kadpcm"),
    @XmlEnumValue("audio/vnd.sealedmedia.softseal.mpeg")
    AUDIO_VND_SEALEDMEDIA_SOFTSEAL_MPEG("audio/vnd.sealedmedia.softseal.mpeg"),
    @XmlEnumValue("audio/vnd.vmx.cvsd")
    AUDIO_VND_VMX_CVSD("audio/vnd.vmx.cvsd"),
    @XmlEnumValue("image/cgm")
    IMAGE_CGM("image/cgm"),
    @XmlEnumValue("image/fits")
    IMAGE_FITS("image/fits"),
    @XmlEnumValue("image/g3fax")
    IMAGE_G_3_FAX("image/g3fax"),
    @XmlEnumValue("image/gif")
    IMAGE_GIF("image/gif"),
    @XmlEnumValue("image/ief")
    IMAGE_IEF("image/ief"),
    @XmlEnumValue("image/jp2")
    IMAGE_JP_2("image/jp2"),
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/jpm")
    IMAGE_JPM("image/jpm"),
    @XmlEnumValue("image/jpx")
    IMAGE_JPX("image/jpx"),
    @XmlEnumValue("image/naplps")
    IMAGE_NAPLPS("image/naplps"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/prs.btif")
    IMAGE_PRS_BTIF("image/prs.btif"),
    @XmlEnumValue("image/prs.pti")
    IMAGE_PRS_PTI("image/prs.pti"),
    @XmlEnumValue("image/t38")
    IMAGE_T_38("image/t38"),
    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff"),
    @XmlEnumValue("image/tiff-fx")
    IMAGE_TIFF_FX("image/tiff-fx"),
    @XmlEnumValue("image/vnd.cns.inf2")
    IMAGE_VND_CNS_INF_2("image/vnd.cns.inf2"),
    @XmlEnumValue("image/vnd.djvu")
    IMAGE_VND_DJVU("image/vnd.djvu"),
    @XmlEnumValue("image/vnd.dwg")
    IMAGE_VND_DWG("image/vnd.dwg"),
    @XmlEnumValue("image/vnd.dxf")
    IMAGE_VND_DXF("image/vnd.dxf"),
    @XmlEnumValue("image/vnd.fastbidsheet")
    IMAGE_VND_FASTBIDSHEET("image/vnd.fastbidsheet"),
    @XmlEnumValue("image/vnd.fpx")
    IMAGE_VND_FPX("image/vnd.fpx"),
    @XmlEnumValue("image/vnd.fst")
    IMAGE_VND_FST("image/vnd.fst"),
    @XmlEnumValue("image/vnd.fujixerox.edmics-mmr")
    IMAGE_VND_FUJIXEROX_EDMICS_MMR("image/vnd.fujixerox.edmics-mmr"),
    @XmlEnumValue("image/vnd.fujixerox.edmics-rlc")
    IMAGE_VND_FUJIXEROX_EDMICS_RLC("image/vnd.fujixerox.edmics-rlc"),
    @XmlEnumValue("image/vnd.globalgraphics.pgb")
    IMAGE_VND_GLOBALGRAPHICS_PGB("image/vnd.globalgraphics.pgb"),
    @XmlEnumValue("image/vnd.microsoft.icon")
    IMAGE_VND_MICROSOFT_ICON("image/vnd.microsoft.icon"),
    @XmlEnumValue("image/vnd.mix")
    IMAGE_VND_MIX("image/vnd.mix"),
    @XmlEnumValue("image/vnd.ms-modi")
    IMAGE_VND_MS_MODI("image/vnd.ms-modi"),
    @XmlEnumValue("image/vnd.net-fpx")
    IMAGE_VND_NET_FPX("image/vnd.net-fpx"),
    @XmlEnumValue("image/vnd.sealed.png")
    IMAGE_VND_SEALED_PNG("image/vnd.sealed.png"),
    @XmlEnumValue("image/vnd.sealedmedia.softseal.gif")
    IMAGE_VND_SEALEDMEDIA_SOFTSEAL_GIF("image/vnd.sealedmedia.softseal.gif"),
    @XmlEnumValue("image/vnd.sealedmedia.softseal.jpg")
    IMAGE_VND_SEALEDMEDIA_SOFTSEAL_JPG("image/vnd.sealedmedia.softseal.jpg"),
    @XmlEnumValue("image/vnd.svf")
    IMAGE_VND_SVF("image/vnd.svf"),
    @XmlEnumValue("image/vnd.wap.wbmp")
    IMAGE_VND_WAP_WBMP("image/vnd.wap.wbmp"),
    @XmlEnumValue("image/vnd.xiff")
    IMAGE_VND_XIFF("image/vnd.xiff"),
    @XmlEnumValue("message/CPIM")
    MESSAGE_CPIM("message/CPIM"),
    @XmlEnumValue("message/delivery-status")
    MESSAGE_DELIVERY_STATUS("message/delivery-status"),
    @XmlEnumValue("message/disposition-notification")
    MESSAGE_DISPOSITION_NOTIFICATION("message/disposition-notification"),
    @XmlEnumValue("message/external-body")
    MESSAGE_EXTERNAL_BODY("message/external-body"),
    @XmlEnumValue("message/http")
    MESSAGE_HTTP("message/http"),
    @XmlEnumValue("message/news")
    MESSAGE_NEWS("message/news"),
    @XmlEnumValue("message/partial")
    MESSAGE_PARTIAL("message/partial"),
    @XmlEnumValue("message/rfc822")
    MESSAGE_RFC_822("message/rfc822"),
    @XmlEnumValue("message/s-http")
    MESSAGE_S_HTTP("message/s-http"),
    @XmlEnumValue("message/sip")
    MESSAGE_SIP("message/sip"),
    @XmlEnumValue("message/sipfrag")
    MESSAGE_SIPFRAG("message/sipfrag"),
    @XmlEnumValue("message/tracking-status")
    MESSAGE_TRACKING_STATUS("message/tracking-status"),
    @XmlEnumValue("model/iges")
    MODEL_IGES("model/iges"),
    @XmlEnumValue("model/mesh")
    MODEL_MESH("model/mesh"),
    @XmlEnumValue("model/vnd.dwf")
    MODEL_VND_DWF("model/vnd.dwf"),
    @XmlEnumValue("model/vnd.flatland.3dml")
    MODEL_VND_FLATLAND_3_DML("model/vnd.flatland.3dml"),
    @XmlEnumValue("model/vnd.gdl")
    MODEL_VND_GDL("model/vnd.gdl"),
    @XmlEnumValue("model/vnd.gs-gdl")
    MODEL_VND_GS_GDL("model/vnd.gs-gdl"),
    @XmlEnumValue("model/vnd.gtw")
    MODEL_VND_GTW("model/vnd.gtw"),
    @XmlEnumValue("model/vnd.mts")
    MODEL_VND_MTS("model/vnd.mts"),
    @XmlEnumValue("model/vnd.parasolid.transmit.binary")
    MODEL_VND_PARASOLID_TRANSMIT_BINARY("model/vnd.parasolid.transmit.binary"),
    @XmlEnumValue("model/vnd.parasolid.transmit.text")
    MODEL_VND_PARASOLID_TRANSMIT_TEXT("model/vnd.parasolid.transmit.text"),
    @XmlEnumValue("model/vnd.vtu")
    MODEL_VND_VTU("model/vnd.vtu"),
    @XmlEnumValue("model/vrml")
    MODEL_VRML("model/vrml"),
    @XmlEnumValue("multipart/alternative")
    MULTIPART_ALTERNATIVE("multipart/alternative"),
    @XmlEnumValue("multipart/appledouble")
    MULTIPART_APPLEDOUBLE("multipart/appledouble"),
    @XmlEnumValue("multipart/byteranges")
    MULTIPART_BYTERANGES("multipart/byteranges"),
    @XmlEnumValue("multipart/digest")
    MULTIPART_DIGEST("multipart/digest"),
    @XmlEnumValue("multipart/encrypted")
    MULTIPART_ENCRYPTED("multipart/encrypted"),
    @XmlEnumValue("multipart/form-data")
    MULTIPART_FORM_DATA("multipart/form-data"),
    @XmlEnumValue("multipart/header-set")
    MULTIPART_HEADER_SET("multipart/header-set"),
    @XmlEnumValue("multipart/mixed")
    MULTIPART_MIXED("multipart/mixed"),
    @XmlEnumValue("multipart/parallel")
    MULTIPART_PARALLEL("multipart/parallel"),
    @XmlEnumValue("multipart/related")
    MULTIPART_RELATED("multipart/related"),
    @XmlEnumValue("multipart/report")
    MULTIPART_REPORT("multipart/report"),
    @XmlEnumValue("multipart/signed")
    MULTIPART_SIGNED("multipart/signed"),
    @XmlEnumValue("multipart/voice-message")
    MULTIPART_VOICE_MESSAGE("multipart/voice-message"),
    @XmlEnumValue("text/RED")
    TEXT_RED("text/RED"),
    @XmlEnumValue("text/calendar")
    TEXT_CALENDAR("text/calendar"),
    @XmlEnumValue("text/css")
    TEXT_CSS("text/css"),
    @XmlEnumValue("text/csv")
    TEXT_CSV("text/csv"),
    @XmlEnumValue("text/directory")
    TEXT_DIRECTORY("text/directory"),
    @XmlEnumValue("text/dns")
    TEXT_DNS("text/dns"),
    @XmlEnumValue("text/enriched")
    TEXT_ENRICHED("text/enriched"),
    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),
    @XmlEnumValue("text/parityfec")
    TEXT_PARITYFEC("text/parityfec"),
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),
    @XmlEnumValue("text/prs.fallenstein.rst")
    TEXT_PRS_FALLENSTEIN_RST("text/prs.fallenstein.rst"),
    @XmlEnumValue("text/prs.lines.tag")
    TEXT_PRS_LINES_TAG("text/prs.lines.tag"),
    @XmlEnumValue("text/rfc822-headers")
    TEXT_RFC_822_HEADERS("text/rfc822-headers"),
    @XmlEnumValue("text/richtext")
    TEXT_RICHTEXT("text/richtext"),
    @XmlEnumValue("text/rtf")
    TEXT_RTF("text/rtf"),
    @XmlEnumValue("text/sgml")
    TEXT_SGML("text/sgml"),
    @XmlEnumValue("text/t140")
    TEXT_T_140("text/t140"),
    @XmlEnumValue("text/tab-separated-values")
    TEXT_TAB_SEPARATED_VALUES("text/tab-separated-values"),
    @XmlEnumValue("text/troff")
    TEXT_TROFF("text/troff"),
    @XmlEnumValue("text/uri-list")
    TEXT_URI_LIST("text/uri-list"),
    @XmlEnumValue("text/vnd.DMClientScript")
    TEXT_VND_DM_CLIENT_SCRIPT("text/vnd.DMClientScript"),
    @XmlEnumValue("text/vnd.IPTC.NITF")
    TEXT_VND_IPTC_NITF("text/vnd.IPTC.NITF"),
    @XmlEnumValue("text/vnd.IPTC.NewsML")
    TEXT_VND_IPTC_NEWS_ML("text/vnd.IPTC.NewsML"),
    @XmlEnumValue("text/vnd.abc")
    TEXT_VND_ABC("text/vnd.abc"),
    @XmlEnumValue("text/vnd.curl")
    TEXT_VND_CURL("text/vnd.curl"),
    @XmlEnumValue("text/vnd.esmertec.theme-descriptor")
    TEXT_VND_ESMERTEC_THEME_DESCRIPTOR("text/vnd.esmertec.theme-descriptor"),
    @XmlEnumValue("text/vnd.fly")
    TEXT_VND_FLY("text/vnd.fly"),
    @XmlEnumValue("text/vnd.fmi.flexstor")
    TEXT_VND_FMI_FLEXSTOR("text/vnd.fmi.flexstor"),
    @XmlEnumValue("text/vnd.in3d.3dml")
    TEXT_VND_IN_3_D_3_DML("text/vnd.in3d.3dml"),
    @XmlEnumValue("text/vnd.in3d.spot")
    TEXT_VND_IN_3_D_SPOT("text/vnd.in3d.spot"),
    @XmlEnumValue("text/vnd.latex-z")
    TEXT_VND_LATEX_Z("text/vnd.latex-z"),
    @XmlEnumValue("text/vnd.motorola.reflex")
    TEXT_VND_MOTOROLA_REFLEX("text/vnd.motorola.reflex"),
    @XmlEnumValue("text/vnd.ms-mediapackage")
    TEXT_VND_MS_MEDIAPACKAGE("text/vnd.ms-mediapackage"),
    @XmlEnumValue("text/vnd.net2phone.commcenter.command")
    TEXT_VND_NET_2_PHONE_COMMCENTER_COMMAND("text/vnd.net2phone.commcenter.command"),
    @XmlEnumValue("text/vnd.sun.j2me.app-descriptor")
    TEXT_VND_SUN_J_2_ME_APP_DESCRIPTOR("text/vnd.sun.j2me.app-descriptor"),
    @XmlEnumValue("text/vnd.wap.si")
    TEXT_VND_WAP_SI("text/vnd.wap.si"),
    @XmlEnumValue("text/vnd.wap.sl")
    TEXT_VND_WAP_SL("text/vnd.wap.sl"),
    @XmlEnumValue("text/vnd.wap.wml")
    TEXT_VND_WAP_WML("text/vnd.wap.wml"),
    @XmlEnumValue("text/vnd.wap.wmlscript")
    TEXT_VND_WAP_WMLSCRIPT("text/vnd.wap.wmlscript"),
    @XmlEnumValue("text/xml")
    TEXT_XML("text/xml"),
    @XmlEnumValue("text/xml-external-parsed-entity")
    TEXT_XML_EXTERNAL_PARSED_ENTITY("text/xml-external-parsed-entity"),
    @XmlEnumValue("video/3gpp")
    VIDEO_3_GPP("video/3gpp"),
    @XmlEnumValue("video/BMPEG")
    VIDEO_BMPEG("video/BMPEG"),
    @XmlEnumValue("video/BT656")
    VIDEO_BT_656("video/BT656"),
    @XmlEnumValue("video/CelB")
    VIDEO_CEL_B("video/CelB"),
    @XmlEnumValue("video/DV")
    VIDEO_DV("video/DV"),
    @XmlEnumValue("video/H261")
    VIDEO_H_261("video/H261"),
    @XmlEnumValue("video/H263")
    VIDEO_H_263("video/H263"),
    @XmlEnumValue("video/H263-1998")
    VIDEO_H_263_1998("video/H263-1998"),
    @XmlEnumValue("video/H263-2000")
    VIDEO_H_263_2000("video/H263-2000"),
    @XmlEnumValue("video/H264")
    VIDEO_H_264("video/H264"),
    @XmlEnumValue("video/JPEG")
    VIDEO_JPEG("video/JPEG"),
    @XmlEnumValue("video/MJ2")
    VIDEO_MJ_2("video/MJ2"),
    @XmlEnumValue("video/MP1S")
    VIDEO_MP_1_S("video/MP1S"),
    @XmlEnumValue("video/MP2P")
    VIDEO_MP_2_P("video/MP2P"),
    @XmlEnumValue("video/MP2T")
    VIDEO_MP_2_T("video/MP2T"),
    @XmlEnumValue("video/MP4V-ES")
    VIDEO_MP_4_V_ES("video/MP4V-ES"),
    @XmlEnumValue("video/MPV")
    VIDEO_MPV("video/MPV"),
    @XmlEnumValue("video/SMPTE292M")
    VIDEO_SMPTE_292_M("video/SMPTE292M"),
    @XmlEnumValue("video/mpeg")
    VIDEO_MPEG("video/mpeg"),
    @XmlEnumValue("video/mpeg4-generic")
    VIDEO_MPEG_4_GENERIC("video/mpeg4-generic"),
    @XmlEnumValue("video/nv")
    VIDEO_NV("video/nv"),
    @XmlEnumValue("video/parityfec")
    VIDEO_PARITYFEC("video/parityfec"),
    @XmlEnumValue("video/pointer")
    VIDEO_POINTER("video/pointer"),
    @XmlEnumValue("video/quicktime")
    VIDEO_QUICKTIME("video/quicktime"),
    @XmlEnumValue("video/raw")
    VIDEO_RAW("video/raw"),
    @XmlEnumValue("video/vnd.fvt")
    VIDEO_VND_FVT("video/vnd.fvt"),
    @XmlEnumValue("video/vnd.motorola.video")
    VIDEO_VND_MOTOROLA_VIDEO("video/vnd.motorola.video"),
    @XmlEnumValue("video/vnd.motorola.videop")
    VIDEO_VND_MOTOROLA_VIDEOP("video/vnd.motorola.videop"),
    @XmlEnumValue("video/vnd.mpegurl")
    VIDEO_VND_MPEGURL("video/vnd.mpegurl"),
    @XmlEnumValue("video/vnd.nokia.interleaved-multimedia")
    VIDEO_VND_NOKIA_INTERLEAVED_MULTIMEDIA("video/vnd.nokia.interleaved-multimedia"),
    @XmlEnumValue("video/vnd.objectvideo")
    VIDEO_VND_OBJECTVIDEO("video/vnd.objectvideo"),
    @XmlEnumValue("video/vnd.sealed.mpeg1")
    VIDEO_VND_SEALED_MPEG_1("video/vnd.sealed.mpeg1"),
    @XmlEnumValue("video/vnd.sealed.mpeg4")
    VIDEO_VND_SEALED_MPEG_4("video/vnd.sealed.mpeg4"),
    @XmlEnumValue("video/vnd.sealed.swf")
    VIDEO_VND_SEALED_SWF("video/vnd.sealed.swf"),
    @XmlEnumValue("video/vnd.sealedmedia.softseal.mov")
    VIDEO_VND_SEALEDMEDIA_SOFTSEAL_MOV("video/vnd.sealedmedia.softseal.mov"),
    @XmlEnumValue("video/vnd.vivo")
    VIDEO_VND_VIVO("video/vnd.vivo");
    private final String value;

    BinaryObjectMimeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BinaryObjectMimeCodeContentType fromValue(String v) {
        for (BinaryObjectMimeCodeContentType c: BinaryObjectMimeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
