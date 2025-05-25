package lib.zj.office.fc.dom4j.io;

import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import lib.zj.office.fc.dom4j.DocumentHelper;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;

/* loaded from: classes3.dex */
public class HTMLWriter extends XMLWriter {
    protected static final OutputFormat DEFAULT_HTML_FORMAT;
    protected static final HashSet DEFAULT_PREFORMATTED_TAGS;
    private static String lineSeparator = System.getProperty("line.separator");
    private Stack formatStack;
    private String lastText;
    private int newLineAfterNTags;
    private HashSet omitElementCloseSet;
    private HashSet preformattedTags;
    private int tagsOuput;

    /* loaded from: classes3.dex */
    public class FormatState {
        private String indent;
        private boolean newlines;
        private boolean trimText;

        public FormatState(boolean z10, boolean z11, String str) {
            this.newlines = z10;
            this.trimText = z11;
            this.indent = str;
        }

        public String getIndent() {
            return this.indent;
        }

        public boolean isNewlines() {
            return this.newlines;
        }

        public boolean isTrimText() {
            return this.trimText;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        DEFAULT_PREFORMATTED_TAGS = hashSet;
        hashSet.add("PRE");
        hashSet.add("SCRIPT");
        hashSet.add("STYLE");
        hashSet.add("TEXTAREA");
        OutputFormat outputFormat = new OutputFormat("  ", true);
        DEFAULT_HTML_FORMAT = outputFormat;
        outputFormat.setTrimText(true);
        outputFormat.setSuppressDeclaration(true);
    }

    public HTMLWriter(Writer writer) {
        super(writer, DEFAULT_HTML_FORMAT);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    private HashSet internalGetOmitElementCloseSet() {
        if (this.omitElementCloseSet == null) {
            HashSet hashSet = new HashSet();
            this.omitElementCloseSet = hashSet;
            loadOmitElementCloseSet(hashSet);
        }
        return this.omitElementCloseSet;
    }

    private String justSpaces(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\n' && charAt != '\r') {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    private void lazyInitNewLinesAfterNTags() {
        if (getOutputFormat().isNewlines()) {
            this.newLineAfterNTags = 0;
        } else {
            this.newLineAfterNTags = getOutputFormat().getNewLineAfterNTags();
        }
    }

    public static String prettyPrintHTML(String str) {
        return prettyPrintHTML(str, true, true, false, true);
    }

    public static String prettyPrintXHTML(String str) {
        return prettyPrintHTML(str, true, true, true, false);
    }

    public Set getOmitElementCloseSet() {
        return (Set) internalGetOmitElementCloseSet().clone();
    }

    public Set getPreformattedTags() {
        return (Set) this.preformattedTags.clone();
    }

    public boolean isPreformattedTag(String str) {
        HashSet hashSet = this.preformattedTags;
        if (hashSet != null && hashSet.contains(str.toUpperCase())) {
            return true;
        }
        return false;
    }

    public void loadOmitElementCloseSet(Set set) {
        set.add("AREA");
        set.add("BASE");
        set.add("BR");
        set.add("COL");
        set.add("HR");
        set.add("IMG");
        set.add("INPUT");
        set.add("LINK");
        set.add("META");
        set.add("P");
        set.add("PARAM");
    }

    public boolean omitElementClose(String str) {
        return internalGetOmitElementCloseSet().contains(str.toUpperCase());
    }

    public void setOmitElementCloseSet(Set set) {
        this.omitElementCloseSet = new HashSet();
        if (set != null) {
            this.omitElementCloseSet = new HashSet();
            for (Object obj : set) {
                if (obj != null) {
                    this.omitElementCloseSet.add(obj.toString().toUpperCase());
                }
            }
        }
    }

    public void setPreformattedTags(Set set) {
        this.preformattedTags = new HashSet();
        if (set != null) {
            for (Object obj : set) {
                if (obj != null) {
                    this.preformattedTags.add(obj.toString().toUpperCase());
                }
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeCDATA(String str) {
        if (getOutputFormat().isXHTML()) {
            super.writeCDATA(str);
        } else {
            this.writer.write(str);
        }
        this.lastOutputNodeType = 4;
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeClose(String str) {
        if (!omitElementClose(str)) {
            super.writeClose(str);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeElement(Element element) {
        int i10;
        if (this.newLineAfterNTags == -1) {
            lazyInitNewLinesAfterNTags();
        }
        int i11 = this.newLineAfterNTags;
        if (i11 > 0 && (i10 = this.tagsOuput) > 0 && i10 % i11 == 0) {
            this.writer.write(lineSeparator);
        }
        this.tagsOuput++;
        String qualifiedName = element.getQualifiedName();
        String str = this.lastText;
        element.nodeCount();
        if (isPreformattedTag(qualifiedName)) {
            OutputFormat outputFormat = getOutputFormat();
            boolean isNewlines = outputFormat.isNewlines();
            boolean isTrimText = outputFormat.isTrimText();
            String indent = outputFormat.getIndent();
            this.formatStack.push(new FormatState(isNewlines, isTrimText, indent));
            try {
                super.writePrintln();
                if (str.trim().length() == 0 && indent != null && indent.length() > 0) {
                    this.writer.write(justSpaces(str));
                }
                outputFormat.setNewlines(false);
                outputFormat.setTrimText(false);
                outputFormat.setIndent("");
                super.writeElement(element);
                return;
            } finally {
                FormatState formatState = (FormatState) this.formatStack.pop();
                outputFormat.setNewlines(formatState.isNewlines());
                outputFormat.setTrimText(formatState.isTrimText());
                outputFormat.setIndent(formatState.getIndent());
            }
        }
        super.writeElement(element);
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeEmptyElementClose(String str) {
        if (getOutputFormat().isXHTML()) {
            if (omitElementClose(str)) {
                this.writer.write(" />");
            } else {
                super.writeEmptyElementClose(str);
            }
        } else if (omitElementClose(str)) {
            this.writer.write(">");
        } else {
            super.writeEmptyElementClose(str);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeEntity(Entity entity) {
        this.writer.write(entity.getText());
        this.lastOutputNodeType = 5;
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeString(String str) {
        if (str.equals("\n")) {
            if (!this.formatStack.empty()) {
                super.writeString(lineSeparator);
                return;
            }
            return;
        }
        this.lastText = str;
        if (this.formatStack.empty()) {
            super.writeString(str.trim());
        } else {
            super.writeString(str);
        }
    }

    public static String prettyPrintHTML(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        StringWriter stringWriter = new StringWriter();
        OutputFormat createPrettyPrint = OutputFormat.createPrettyPrint();
        createPrettyPrint.setNewlines(z10);
        createPrettyPrint.setTrimText(z11);
        createPrettyPrint.setXHTML(z12);
        createPrettyPrint.setExpandEmptyElements(z13);
        HTMLWriter hTMLWriter = new HTMLWriter(stringWriter, createPrettyPrint);
        hTMLWriter.write(DocumentHelper.parseText(str));
        hTMLWriter.flush();
        return stringWriter.toString();
    }

    public HTMLWriter(Writer writer, OutputFormat outputFormat) {
        super(writer, outputFormat);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter() {
        super(DEFAULT_HTML_FORMAT);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(OutputFormat outputFormat) {
        super(outputFormat);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter, org.xml.sax.ext.LexicalHandler
    public void endCDATA() {
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter, org.xml.sax.ext.LexicalHandler
    public void startCDATA() {
    }

    @Override // lib.zj.office.fc.dom4j.io.XMLWriter
    public void writeDeclaration() {
    }

    public HTMLWriter(OutputStream outputStream) {
        super(outputStream, DEFAULT_HTML_FORMAT);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(OutputStream outputStream, OutputFormat outputFormat) {
        super(outputStream, outputFormat);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }
}
