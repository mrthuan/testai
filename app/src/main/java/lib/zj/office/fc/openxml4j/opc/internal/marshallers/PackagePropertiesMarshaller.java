package lib.zj.office.fc.openxml4j.opc.internal.marshallers;

import java.io.OutputStream;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentHelper;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.internal.PackagePropertiesPart;
import lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller;

/* loaded from: classes3.dex */
public class PackagePropertiesMarshaller implements PartMarshaller {
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
    PackagePropertiesPart propsPart;
    Document xmlDoc = null;
    private static final Namespace namespaceDC = new Namespace("dc", "http://purl.org/dc/elements/1.1/");
    private static final Namespace namespaceCoreProperties = new Namespace("", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    private static final Namespace namespaceDcTerms = new Namespace("dcterms", "http://purl.org/dc/terms/");
    private static final Namespace namespaceXSI = new Namespace("xsi", PackagePropertiesPart.NAMESPACE_XSI_URI);

    private void addCategory() {
        if (!this.propsPart.getCategoryProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_CATEGORY, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_CATEGORY, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getCategoryProperty().getValue());
    }

    private void addContentStatus() {
        if (!this.propsPart.getContentStatusProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_CONTENT_STATUS, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_CONTENT_STATUS, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getContentStatusProperty().getValue());
    }

    private void addContentType() {
        if (!this.propsPart.getContentTypeProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_CONTENT_TYPE, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_CONTENT_TYPE, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getContentTypeProperty().getValue());
    }

    private void addCreated() {
        if (!this.propsPart.getCreatedProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDcTerms;
        Element element = rootElement.element(new QName(KEYWORD_CREATED, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_CREATED, namespace));
        } else {
            element.clearContent();
        }
        element.addAttribute(new QName("type", namespaceXSI), "dcterms:W3CDTF");
        element.addText(this.propsPart.getCreatedPropertyString());
    }

    private void addCreator() {
        if (!this.propsPart.getCreatorProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDC;
        Element element = rootElement.element(new QName(KEYWORD_CREATOR, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_CREATOR, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getCreatorProperty().getValue());
    }

    private void addDescription() {
        if (!this.propsPart.getDescriptionProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDC;
        Element element = rootElement.element(new QName("description", namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName("description", namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getDescriptionProperty().getValue());
    }

    private void addIdentifier() {
        if (!this.propsPart.getIdentifierProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDC;
        Element element = rootElement.element(new QName(KEYWORD_IDENTIFIER, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_IDENTIFIER, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getIdentifierProperty().getValue());
    }

    private void addKeywords() {
        if (!this.propsPart.getKeywordsProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_KEYWORDS, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_KEYWORDS, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getKeywordsProperty().getValue());
    }

    private void addLanguage() {
        if (!this.propsPart.getLanguageProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDC;
        Element element = rootElement.element(new QName(KEYWORD_LANGUAGE, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_LANGUAGE, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getLanguageProperty().getValue());
    }

    private void addLastModifiedBy() {
        if (!this.propsPart.getLastModifiedByProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_LAST_MODIFIED_BY, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_LAST_MODIFIED_BY, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getLastModifiedByProperty().getValue());
    }

    private void addLastPrinted() {
        if (!this.propsPart.getLastPrintedProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_LAST_PRINTED, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_LAST_PRINTED, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getLastPrintedPropertyString());
    }

    private void addModified() {
        if (!this.propsPart.getModifiedProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDcTerms;
        Element element = rootElement.element(new QName(KEYWORD_MODIFIED, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_MODIFIED, namespace));
        } else {
            element.clearContent();
        }
        element.addAttribute(new QName("type", namespaceXSI), "dcterms:W3CDTF");
        element.addText(this.propsPart.getModifiedPropertyString());
    }

    private void addRevision() {
        if (!this.propsPart.getRevisionProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_REVISION, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_REVISION, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getRevisionProperty().getValue());
    }

    private void addSubject() {
        if (!this.propsPart.getSubjectProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDC;
        Element element = rootElement.element(new QName(KEYWORD_SUBJECT, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_SUBJECT, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getSubjectProperty().getValue());
    }

    private void addTitle() {
        if (!this.propsPart.getTitleProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceDC;
        Element element = rootElement.element(new QName("title", namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName("title", namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getTitleProperty().getValue());
    }

    private void addVersion() {
        if (!this.propsPart.getVersionProperty().hasValue()) {
            return;
        }
        Element rootElement = this.xmlDoc.getRootElement();
        Namespace namespace = namespaceCoreProperties;
        Element element = rootElement.element(new QName(KEYWORD_VERSION, namespace));
        if (element == null) {
            element = this.xmlDoc.getRootElement().addElement(new QName(KEYWORD_VERSION, namespace));
        } else {
            element.clearContent();
        }
        element.addText(this.propsPart.getVersionProperty().getValue());
    }

    @Override // lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller
    public boolean marshall(PackagePart packagePart, OutputStream outputStream) {
        if (packagePart instanceof PackagePropertiesPart) {
            this.propsPart = (PackagePropertiesPart) packagePart;
            Document createDocument = DocumentHelper.createDocument();
            this.xmlDoc = createDocument;
            Element addElement = createDocument.addElement(new QName("coreProperties", namespaceCoreProperties));
            addElement.addNamespace("cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
            addElement.addNamespace("dc", "http://purl.org/dc/elements/1.1/");
            addElement.addNamespace("dcterms", "http://purl.org/dc/terms/");
            addElement.addNamespace("xsi", PackagePropertiesPart.NAMESPACE_XSI_URI);
            addCategory();
            addContentStatus();
            addContentType();
            addCreated();
            addCreator();
            addDescription();
            addIdentifier();
            addKeywords();
            addLanguage();
            addLastModifiedBy();
            addLastPrinted();
            addModified();
            addRevision();
            addSubject();
            addTitle();
            addVersion();
            return true;
        }
        throw new IllegalArgumentException("'part' must be a PackagePropertiesPart instance.");
    }
}
