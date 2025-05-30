package lib.zj.office.fc.dom4j.io;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes3.dex */
public class SAXEventRecorder extends DefaultHandler implements LexicalHandler, DeclHandler, DTDHandler, Externalizable {
    private static final String EMPTY_STRING = "";
    private static final byte NULL = 2;
    private static final byte OBJECT = 1;
    private static final byte STRING = 0;
    private static final String XMLNS = "xmlns";
    public static final long serialVersionUID = 1;
    private List events = new ArrayList();
    private Map prefixMappings = new HashMap();

    /* loaded from: classes3.dex */
    public static class SAXEvent implements Externalizable {
        static final byte ATTRIBUTE_DECL = 17;
        static final byte CHARACTERS = 8;
        static final byte COMMENT = 15;
        static final byte ELEMENT_DECL = 16;
        static final byte END_CDATA = 14;
        static final byte END_DOCUMENT = 5;
        static final byte END_DTD = 10;
        static final byte END_ELEMENT = 7;
        static final byte END_ENTITY = 12;
        static final byte END_PREFIX_MAPPING = 3;
        static final byte EXTERNAL_ENTITY_DECL = 19;
        static final byte INTERNAL_ENTITY_DECL = 18;
        static final byte PROCESSING_INSTRUCTION = 1;
        static final byte START_CDATA = 13;
        static final byte START_DOCUMENT = 4;
        static final byte START_DTD = 9;
        static final byte START_ELEMENT = 6;
        static final byte START_ENTITY = 11;
        static final byte START_PREFIX_MAPPING = 2;
        public static final long serialVersionUID = 1;
        protected byte event;
        protected List parms;

        public SAXEvent() {
        }

        public void addParm(Object obj) {
            if (this.parms == null) {
                this.parms = new ArrayList(3);
            }
            this.parms.add(obj);
        }

        public Object getParm(int i10) {
            List list = this.parms;
            if (list != null && i10 < list.size()) {
                return this.parms.get(i10);
            }
            return null;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            this.event = objectInput.readByte();
            if (objectInput.readByte() != 2) {
                this.parms = (List) objectInput.readObject();
            }
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeByte(this.event);
            if (this.parms == null) {
                objectOutput.writeByte(2);
                return;
            }
            objectOutput.writeByte(1);
            objectOutput.writeObject(this.parms);
        }

        public SAXEvent(byte b10) {
            this.event = b10;
        }
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void attributeDecl(String str, String str2, String str3, String str4, String str5) {
        SAXEvent sAXEvent = new SAXEvent((byte) 17);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        sAXEvent.addParm(str4);
        sAXEvent.addParm(str5);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        SAXEvent sAXEvent = new SAXEvent((byte) 8);
        sAXEvent.addParm(cArr);
        sAXEvent.addParm(new Integer(i10));
        sAXEvent.addParm(new Integer(i11));
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i10, int i11) {
        SAXEvent sAXEvent = new SAXEvent((byte) 15);
        sAXEvent.addParm(cArr);
        sAXEvent.addParm(new Integer(i10));
        sAXEvent.addParm(new Integer(i11));
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void elementDecl(String str, String str2) {
        SAXEvent sAXEvent = new SAXEvent((byte) 16);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() {
        this.events.add(new SAXEvent((byte) 14));
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() {
        this.events.add(new SAXEvent((byte) 10));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        this.events.add(new SAXEvent((byte) 5));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        QName qName;
        SAXEvent sAXEvent = new SAXEvent((byte) 7);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        this.events.add(sAXEvent);
        if (str != null) {
            qName = new QName(str2, Namespace.get(str));
        } else {
            qName = new QName(str2);
        }
        List<Object> list = (List) this.prefixMappings.get(qName);
        if (list != null) {
            for (Object obj : list) {
                SAXEvent sAXEvent2 = new SAXEvent((byte) 3);
                sAXEvent2.addParm(obj);
                this.events.add(sAXEvent2);
            }
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) {
        SAXEvent sAXEvent = new SAXEvent((byte) 12);
        sAXEvent.addParm(str);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
        SAXEvent sAXEvent = new SAXEvent((byte) 3);
        sAXEvent.addParm(str);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void externalEntityDecl(String str, String str2, String str3) {
        SAXEvent sAXEvent = new SAXEvent((byte) 19);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void internalEntityDecl(String str, String str2) {
        SAXEvent sAXEvent = new SAXEvent((byte) 18);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
        SAXEvent sAXEvent = new SAXEvent((byte) 1);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readByte() != 2) {
            this.events = (List) objectInput.readObject();
        }
    }

    public void replay(ContentHandler contentHandler) {
        for (SAXEvent sAXEvent : this.events) {
            switch (sAXEvent.event) {
                case 1:
                    contentHandler.processingInstruction((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 2:
                    contentHandler.startPrefixMapping((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 3:
                    contentHandler.endPrefixMapping((String) sAXEvent.getParm(0));
                    break;
                case 4:
                    contentHandler.startDocument();
                    break;
                case 5:
                    contentHandler.endDocument();
                    break;
                case 6:
                    AttributesImpl attributesImpl = new AttributesImpl();
                    List<String[]> list = (List) sAXEvent.getParm(3);
                    if (list != null) {
                        for (String[] strArr : list) {
                            attributesImpl.addAttribute(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4]);
                        }
                    }
                    contentHandler.startElement((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2), attributesImpl);
                    break;
                case 7:
                    contentHandler.endElement((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2));
                    break;
                case 8:
                    contentHandler.characters((char[]) sAXEvent.getParm(0), ((Integer) sAXEvent.getParm(1)).intValue(), ((Integer) sAXEvent.getParm(2)).intValue());
                    break;
                case 9:
                    ((LexicalHandler) contentHandler).startDTD((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2));
                    break;
                case 10:
                    ((LexicalHandler) contentHandler).endDTD();
                    break;
                case 11:
                    ((LexicalHandler) contentHandler).startEntity((String) sAXEvent.getParm(0));
                    break;
                case 12:
                    ((LexicalHandler) contentHandler).endEntity((String) sAXEvent.getParm(0));
                    break;
                case 13:
                    ((LexicalHandler) contentHandler).startCDATA();
                    break;
                case 14:
                    ((LexicalHandler) contentHandler).endCDATA();
                    break;
                case 15:
                    ((LexicalHandler) contentHandler).comment((char[]) sAXEvent.getParm(0), ((Integer) sAXEvent.getParm(1)).intValue(), ((Integer) sAXEvent.getParm(2)).intValue());
                    break;
                case 16:
                    ((DeclHandler) contentHandler).elementDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 17:
                    ((DeclHandler) contentHandler).attributeDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2), (String) sAXEvent.getParm(3), (String) sAXEvent.getParm(4));
                    break;
                case 18:
                    ((DeclHandler) contentHandler).internalEntityDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 19:
                    ((DeclHandler) contentHandler).externalEntityDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2));
                    break;
                default:
                    throw new SAXException("Unrecognized event: " + ((int) sAXEvent.event));
            }
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() {
        this.events.add(new SAXEvent((byte) 13));
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) {
        SAXEvent sAXEvent = new SAXEvent((byte) 9);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
        this.events.add(new SAXEvent((byte) 4));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        QName qName;
        String str4;
        SAXEvent sAXEvent = new SAXEvent((byte) 6);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        if (str != null) {
            qName = new QName(str2, Namespace.get(str));
        } else {
            qName = new QName(str2);
        }
        if (attributes != null && attributes.getLength() > 0) {
            ArrayList arrayList = new ArrayList(attributes.getLength());
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                String localName = attributes.getLocalName(i10);
                if (localName.startsWith(XMLNS)) {
                    if (localName.length() > 5) {
                        str4 = localName.substring(6);
                    } else {
                        str4 = "";
                    }
                    SAXEvent sAXEvent2 = new SAXEvent((byte) 2);
                    sAXEvent2.addParm(str4);
                    sAXEvent2.addParm(attributes.getValue(i10));
                    this.events.add(sAXEvent2);
                    List list = (List) this.prefixMappings.get(qName);
                    if (list == null) {
                        list = new ArrayList();
                        this.prefixMappings.put(qName, list);
                    }
                    list.add(str4);
                } else {
                    arrayList.add(new String[]{attributes.getURI(i10), localName, attributes.getQName(i10), attributes.getType(i10), attributes.getValue(i10)});
                }
            }
            sAXEvent.addParm(arrayList);
        }
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) {
        SAXEvent sAXEvent = new SAXEvent((byte) 11);
        sAXEvent.addParm(str);
        this.events.add(sAXEvent);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        SAXEvent sAXEvent = new SAXEvent((byte) 2);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        if (this.events == null) {
            objectOutput.writeByte(2);
            return;
        }
        objectOutput.writeByte(1);
        objectOutput.writeObject(this.events);
    }
}
