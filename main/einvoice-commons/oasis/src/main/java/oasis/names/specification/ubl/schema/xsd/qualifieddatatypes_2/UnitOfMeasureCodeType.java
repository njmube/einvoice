
package oasis.names.specification.ubl.schema.xsd.qualifieddatatypes_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.CodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:DictionaryEntryName&gt;Unit Of Measure_ Code. Type&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Version&gt;2.0&lt;/ccts:Version&gt;&lt;ccts:Definition&gt;The set of code values for Units of Measure Used in International Trade&lt;/ccts:Definition&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:QualifierTerm&gt;Unit Of Measure&lt;/ccts:QualifierTerm&gt;&lt;ccts:UniqueID/&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para UnitOfMeasureCodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnitOfMeasureCodeType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2>CodeType">
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="UN/ECE rec 20" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="6" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" default="United Nations Economic Commission for Europe" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" default="Unit Of Measure" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="Revision 4" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" default="en" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://docs.oasis-open.org/ubl/os-ubl-2.0/cl/gc/cefact/UnitOfMeasureCode-2.0.gc" />
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="urn:un:unece:uncefact:codelist:specification:66411:2001" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasureCodeType")
public class UnitOfMeasureCodeType
    extends CodeType
{


}
