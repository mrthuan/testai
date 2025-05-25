package lib.zj.office.fc.openxml4j.opc.internal.unmarshallers;

import a6.h;
import b.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentException;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.openxml4j.opc.PackageNamespaces;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.internal.PackagePropertiesPart;
import lib.zj.office.fc.openxml4j.opc.internal.PartUnmarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.ZipHelper;

/* loaded from: classes3.dex */
public class PackagePropertiesUnmarshaller implements PartUnmarshaller {
    protected static final String KEYWORD_CATEGORY = "category";
    protected static final String KEYWORD_CONTENT_STATUS = "contentStatus";
    protected static final String KEYWORD_CONTENT_TYPE = "contentType";
    protected static final String KEYWORD_CREATED = "created";
    protected static final String KEYWORD_CREATOR = "creator";
    protected static final String KEYWORD_DESCRIPTION = "description";
    protected static final String KEYWORD_IDENTIFIER = "identifier";
    protected static final String KEYWORD_KEYWORDS = "keywords";
    protected static final String KEYWORD_LANGUAGE = "language";
    protected static final String KEYWORD_LAST_MODIFIED_BY = "lastModifiedBy";
    protected static final String KEYWORD_LAST_PRINTED = "lastPrinted";
    protected static final String KEYWORD_MODIFIED = "modified";
    protected static final String KEYWORD_REVISION = "revision";
    protected static final String KEYWORD_SUBJECT = "subject";
    protected static final String KEYWORD_TITLE = "title";
    protected static final String KEYWORD_VERSION = "version";
    private static final Namespace namespaceDC = new Namespace("dc", "http://purl.org/dc/elements/1.1/");
    private static final Namespace namespaceCP = new Namespace("cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    private static final Namespace namespaceDcTerms = new Namespace("dcterms", "http://purl.org/dc/terms/");
    private static final Namespace namespaceXML = new Namespace(ContentTypes.EXTENSION_XML, "http://www.w3.org/XML/1998/namespace");
    private static final Namespace namespaceXSI = new Namespace("xsi", PackagePropertiesPart.NAMESPACE_XSI_URI);

    private String loadCategory(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_CATEGORY, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadContentStatus(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_CONTENT_STATUS, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadContentType(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_CONTENT_TYPE, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadCreated(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_CREATED, namespaceDcTerms));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadCreator(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_CREATOR, namespaceDC));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadDescription(Document document) {
        Element element = document.getRootElement().element(new QName("description", namespaceDC));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadIdentifier(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_IDENTIFIER, namespaceDC));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadKeywords(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_KEYWORDS, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadLanguage(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_LANGUAGE, namespaceDC));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadLastModifiedBy(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_LAST_MODIFIED_BY, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadLastPrinted(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_LAST_PRINTED, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadModified(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_MODIFIED, namespaceDcTerms));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadRevision(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_REVISION, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadSubject(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_SUBJECT, namespaceDC));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadTitle(Document document) {
        Element element = document.getRootElement().element(new QName("title", namespaceDC));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    private String loadVersion(Document document) {
        Element element = document.getRootElement().element(new QName(KEYWORD_VERSION, namespaceCP));
        if (element == null) {
            return null;
        }
        return element.getStringValue();
    }

    public void checkElementForOPCCompliance(Element element) {
        for (Namespace namespace : element.declaredNamespaces()) {
            if (namespace.getURI().equals(PackageNamespaces.MARKUP_COMPATIBILITY)) {
                throw new InvalidFormatException("OPC Compliance error [M4.2]: A format consumer shall consider the use of the Markup Compatibility namespace to be an error.");
            }
        }
        if (element.getNamespace().getURI().equals("http://purl.org/dc/terms/") && !element.getName().equals(KEYWORD_CREATED) && !element.getName().equals(KEYWORD_MODIFIED)) {
            throw new InvalidFormatException("OPC Compliance error [M4.3]: Producers shall not create a document element that contains refinements to the Dublin Core elements, except for the two specified in the schema: <dcterms:created> and <dcterms:modified> Consumers shall consider a document element that violates this constraint to be an error.");
        }
        if (element.attribute(new QName("lang", namespaceXML)) == null) {
            if (element.getNamespace().getURI().equals("http://purl.org/dc/terms/")) {
                String name = element.getName();
                if (!name.equals(KEYWORD_CREATED) && !name.equals(KEYWORD_MODIFIED)) {
                    throw new InvalidFormatException(h.d("Namespace error : ", name, " shouldn't have the following naemspace -> http://purl.org/dc/terms/"));
                }
                Namespace namespace2 = namespaceXSI;
                Attribute attribute = element.attribute(new QName("type", namespace2));
                if (attribute != null) {
                    if (!attribute.getValue().equals("dcterms:W3CDTF")) {
                        StringBuilder g10 = a.g("The element '", name, "' must have the '");
                        g10.append(namespace2.getPrefix());
                        g10.append(":type' attribute with the value 'dcterms:W3CDTF' !");
                        throw new InvalidFormatException(g10.toString());
                    }
                } else {
                    StringBuilder g11 = a.g("The element '", name, "' must have the '");
                    g11.append(namespace2.getPrefix());
                    g11.append(":type' attribute present !");
                    throw new InvalidFormatException(g11.toString());
                }
            }
            Iterator elementIterator = element.elementIterator();
            while (elementIterator.hasNext()) {
                checkElementForOPCCompliance((Element) elementIterator.next());
            }
            return;
        }
        throw new InvalidFormatException("OPC Compliance error [M4.4]: Producers shall not create a document element that contains the xml:lang attribute. Consumers shall consider a document element that violates this constraint to be an error.");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.internal.PartUnmarshaller
    public PackagePart unmarshall(UnmarshallContext unmarshallContext, InputStream inputStream) {
        PackagePropertiesPart packagePropertiesPart = new PackagePropertiesPart(unmarshallContext.getPackage(), unmarshallContext.getPartName());
        if (inputStream == null) {
            if (unmarshallContext.getZipEntry() != null) {
                inputStream = unmarshallContext.getPackage().getZipArchive().getInputStream(unmarshallContext.getZipEntry());
            } else if (unmarshallContext.getPackage() != null) {
                inputStream = unmarshallContext.getPackage().getZipArchive().getInputStream(ZipHelper.getCorePropertiesZipEntry(unmarshallContext.getPackage()));
            } else {
                throw new IOException("Error while trying to get the part input stream.");
            }
        }
        try {
            Document read = new SAXReader().read(inputStream);
            checkElementForOPCCompliance(read.getRootElement());
            packagePropertiesPart.setCategoryProperty(loadCategory(read));
            packagePropertiesPart.setContentStatusProperty(loadContentStatus(read));
            packagePropertiesPart.setContentTypeProperty(loadContentType(read));
            packagePropertiesPart.setCreatedProperty(loadCreated(read));
            packagePropertiesPart.setCreatorProperty(loadCreator(read));
            packagePropertiesPart.setDescriptionProperty(loadDescription(read));
            packagePropertiesPart.setIdentifierProperty(loadIdentifier(read));
            packagePropertiesPart.setKeywordsProperty(loadKeywords(read));
            packagePropertiesPart.setLanguageProperty(loadLanguage(read));
            packagePropertiesPart.setLastModifiedByProperty(loadLastModifiedBy(read));
            packagePropertiesPart.setLastPrintedProperty(loadLastPrinted(read));
            packagePropertiesPart.setModifiedProperty(loadModified(read));
            packagePropertiesPart.setRevisionProperty(loadRevision(read));
            packagePropertiesPart.setSubjectProperty(loadSubject(read));
            packagePropertiesPart.setTitleProperty(loadTitle(read));
            packagePropertiesPart.setVersionProperty(loadVersion(read));
            return packagePropertiesPart;
        } catch (DocumentException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
