package lib.zj.office.fc.hpsf;

import a6.h;
import java.util.Map;

/* loaded from: classes3.dex */
public class DocumentSummaryInformation extends SpecialPropertySet {
    public static final String DEFAULT_STREAM_NAME = "\u0005DocumentSummaryInformation";

    public DocumentSummaryInformation(PropertySet propertySet) {
        super(propertySet);
        if (isDocumentSummaryInformation()) {
            return;
        }
        throw new UnexpectedPropertySetTypeException("Not a ".concat(getClass().getName()));
    }

    private void ensureSection2() {
        if (getSectionCount() < 2) {
            MutableSection mutableSection = new MutableSection();
            mutableSection.setFormatID(SectionIDMap.DOCUMENT_SUMMARY_INFORMATION_ID[1]);
            addSection(mutableSection);
        }
    }

    private void notYetImplemented(String str) {
        throw new UnsupportedOperationException(h.c(str, " is not yet implemented."));
    }

    public int getByteCount() {
        return getPropertyIntValue(4);
    }

    public String getCategory() {
        return (String) getProperty(2);
    }

    public String getCompany() {
        return (String) getProperty(15);
    }

    public CustomProperties getCustomProperties() {
        Property[] properties;
        if (getSectionCount() >= 2) {
            CustomProperties customProperties = new CustomProperties();
            Section section = (Section) getSections().get(1);
            Map<Long, String> dictionary = section.getDictionary();
            int i10 = 0;
            for (Property property : section.getProperties()) {
                long id2 = property.getID();
                if (id2 != 0 && id2 != 1) {
                    i10++;
                    CustomProperty customProperty = new CustomProperty(property, dictionary.get(Long.valueOf(id2)));
                    customProperties.put(customProperty.getName(), customProperty);
                }
            }
            if (customProperties.size() != i10) {
                customProperties.setPure(false);
                return customProperties;
            }
            return customProperties;
        }
        return null;
    }

    public byte[] getDocparts() {
        notYetImplemented("Reading byte arrays");
        return (byte[]) getProperty(13);
    }

    public byte[] getHeadingPair() {
        notYetImplemented("Reading byte arrays ");
        return (byte[]) getProperty(12);
    }

    public int getHiddenCount() {
        return getPropertyIntValue(9);
    }

    public int getLineCount() {
        return getPropertyIntValue(5);
    }

    public boolean getLinksDirty() {
        return getPropertyBooleanValue(16);
    }

    public int getMMClipCount() {
        return getPropertyIntValue(10);
    }

    public String getManager() {
        return (String) getProperty(14);
    }

    public int getNoteCount() {
        return getPropertyIntValue(8);
    }

    public int getParCount() {
        return getPropertyIntValue(6);
    }

    public String getPresentationFormat() {
        return (String) getProperty(3);
    }

    @Override // lib.zj.office.fc.hpsf.SpecialPropertySet
    public PropertyIDMap getPropertySetIDMap() {
        return PropertyIDMap.getDocumentSummaryInformationProperties();
    }

    public boolean getScale() {
        return getPropertyBooleanValue(11);
    }

    public int getSlideCount() {
        return getPropertyIntValue(7);
    }

    public void removeByteCount() {
        ((MutableSection) getFirstSection()).removeProperty(4L);
    }

    public void removeCategory() {
        ((MutableSection) getFirstSection()).removeProperty(2L);
    }

    public void removeCompany() {
        ((MutableSection) getFirstSection()).removeProperty(15L);
    }

    public void removeCustomProperties() {
        if (getSectionCount() >= 2) {
            getSections().remove(1);
            return;
        }
        throw new HPSFRuntimeException("Illegal internal format of Document SummaryInformation stream: second section is missing.");
    }

    public void removeDocparts() {
        ((MutableSection) getFirstSection()).removeProperty(13L);
    }

    public void removeHeadingPair() {
        ((MutableSection) getFirstSection()).removeProperty(12L);
    }

    public void removeHiddenCount() {
        ((MutableSection) getFirstSection()).removeProperty(9L);
    }

    public void removeLineCount() {
        ((MutableSection) getFirstSection()).removeProperty(5L);
    }

    public void removeLinksDirty() {
        ((MutableSection) getFirstSection()).removeProperty(16L);
    }

    public void removeMMClipCount() {
        ((MutableSection) getFirstSection()).removeProperty(10L);
    }

    public void removeManager() {
        ((MutableSection) getFirstSection()).removeProperty(14L);
    }

    public void removeNoteCount() {
        ((MutableSection) getFirstSection()).removeProperty(8L);
    }

    public void removeParCount() {
        ((MutableSection) getFirstSection()).removeProperty(6L);
    }

    public void removePresentationFormat() {
        ((MutableSection) getFirstSection()).removeProperty(3L);
    }

    public void removeScale() {
        ((MutableSection) getFirstSection()).removeProperty(11L);
    }

    public void removeSlideCount() {
        ((MutableSection) getFirstSection()).removeProperty(7L);
    }

    public void setByteCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(4, i10);
    }

    public void setCategory(String str) {
        ((MutableSection) getFirstSection()).setProperty(2, str);
    }

    public void setCompany(String str) {
        ((MutableSection) getFirstSection()).setProperty(15, str);
    }

    public void setCustomProperties(CustomProperties customProperties) {
        ensureSection2();
        MutableSection mutableSection = (MutableSection) getSections().get(1);
        Map<Long, String> dictionary = customProperties.getDictionary();
        mutableSection.clear();
        int codepage = customProperties.getCodepage();
        if (codepage < 0) {
            codepage = mutableSection.getCodepage();
        }
        if (codepage < 0) {
            codepage = 1200;
        }
        customProperties.setCodepage(codepage);
        mutableSection.setCodepage(codepage);
        mutableSection.setDictionary(dictionary);
        for (CustomProperty customProperty : customProperties.values()) {
            mutableSection.setProperty(customProperty);
        }
    }

    public void setDocparts(byte[] bArr) {
        notYetImplemented("Writing byte arrays");
    }

    public void setHeadingPair(byte[] bArr) {
        notYetImplemented("Writing byte arrays ");
    }

    public void setHiddenCount(int i10) {
        ((MutableSection) getSections().get(0)).setProperty(9, i10);
    }

    public void setLineCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(5, i10);
    }

    public void setLinksDirty(boolean z10) {
        ((MutableSection) getFirstSection()).setProperty(16, z10);
    }

    public void setMMClipCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(10, i10);
    }

    public void setManager(String str) {
        ((MutableSection) getFirstSection()).setProperty(14, str);
    }

    public void setNoteCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(8, i10);
    }

    public void setParCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(6, i10);
    }

    public void setPresentationFormat(String str) {
        ((MutableSection) getFirstSection()).setProperty(3, str);
    }

    public void setScale(boolean z10) {
        ((MutableSection) getFirstSection()).setProperty(11, z10);
    }

    public void setSlideCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(7, i10);
    }
}
