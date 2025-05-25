package com.tom_roush.pdfbox.text;

import com.tom_roush.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequence;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequenceWithProperties;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.DrawObject;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.EndMarkedContentSequence;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PDFMarkedContentExtractor extends LegacyPDFStreamEngine {
    private final Map<String, List<TextPosition>> characterListMapping;
    private final Deque<PDMarkedContent> currentMarkedContents;
    private final List<PDMarkedContent> markedContents;
    private boolean suppressDuplicateOverlappingText;

    public PDFMarkedContentExtractor() {
        this(null);
    }

    private boolean within(float f10, float f11, float f12) {
        if (f11 > f10 - f12 && f11 < f10 + f12) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void beginMarkedContentSequence(COSName cOSName, COSDictionary cOSDictionary) {
        PDMarkedContent create = PDMarkedContent.create(cOSName, cOSDictionary);
        if (this.currentMarkedContents.isEmpty()) {
            this.markedContents.add(create);
        } else {
            PDMarkedContent peek = this.currentMarkedContents.peek();
            if (peek != null) {
                peek.addMarkedContent(create);
            }
        }
        this.currentMarkedContents.push(create);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void endMarkedContentSequence() {
        if (!this.currentMarkedContents.isEmpty()) {
            this.currentMarkedContents.pop();
        }
    }

    public List<PDMarkedContent> getMarkedContents() {
        return this.markedContents;
    }

    public boolean isSuppressDuplicateOverlappingText() {
        return this.suppressDuplicateOverlappingText;
    }

    @Override // com.tom_roush.pdfbox.text.LegacyPDFStreamEngine, com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public /* bridge */ /* synthetic */ void processPage(PDPage pDPage) {
        super.processPage(pDPage);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.tom_roush.pdfbox.text.LegacyPDFStreamEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void processTextPosition(com.tom_roush.pdfbox.text.TextPosition r11) {
        /*
            r10 = this;
            boolean r0 = r10.suppressDuplicateOverlappingText
            r1 = 1
            if (r0 == 0) goto L65
            java.lang.String r0 = r11.getUnicode()
            float r2 = r11.getX()
            float r3 = r11.getY()
            java.util.Map<java.lang.String, java.util.List<com.tom_roush.pdfbox.text.TextPosition>> r4 = r10.characterListMapping
            java.lang.Object r4 = r4.get(r0)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L25
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map<java.lang.String, java.util.List<com.tom_roush.pdfbox.text.TextPosition>> r5 = r10.characterListMapping
            r5.put(r0, r4)
        L25:
            float r5 = r11.getWidth()
            int r0 = r0.length()
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 / r0
            java.util.Iterator r0 = r4.iterator()
        L36:
            boolean r6 = r0.hasNext()
            r7 = 0
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r0.next()
            com.tom_roush.pdfbox.text.TextPosition r6 = (com.tom_roush.pdfbox.text.TextPosition) r6
            java.lang.String r8 = r6.getUnicode()
            float r9 = r6.getX()
            float r6 = r6.getY()
            if (r8 == 0) goto L36
            boolean r8 = r10.within(r9, r2, r5)
            if (r8 == 0) goto L36
            boolean r6 = r10.within(r6, r3, r5)
            if (r6 == 0) goto L36
            r0 = r1
            goto L60
        L5f:
            r0 = r7
        L60:
            if (r0 != 0) goto L66
            r4.add(r11)
        L65:
            r7 = r1
        L66:
            if (r7 == 0) goto Lbe
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L77
            r0.add(r11)
            goto Lab
        L77:
            java.lang.Object r2 = androidx.appcompat.view.menu.d.b(r0, r1)
            com.tom_roush.pdfbox.text.TextPosition r2 = (com.tom_roush.pdfbox.text.TextPosition) r2
            boolean r3 = r11.isDiacritic()
            if (r3 == 0) goto L8d
            boolean r3 = r2.contains(r11)
            if (r3 == 0) goto L8d
            r2.mergeDiacritic(r11)
            goto Lab
        L8d:
            boolean r3 = r2.isDiacritic()
            if (r3 == 0) goto La8
            boolean r3 = r11.contains(r2)
            if (r3 == 0) goto La8
            r11.mergeDiacritic(r2)
            int r2 = r0.size()
            int r2 = r2 - r1
            r0.remove(r2)
            r0.add(r11)
            goto Lab
        La8:
            r0.add(r11)
        Lab:
            java.util.Deque<com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent> r0 = r10.currentMarkedContents
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbe
            java.util.Deque<com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent> r0 = r10.currentMarkedContents
            java.lang.Object r0 = r0.peek()
            com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent r0 = (com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent) r0
            r0.addText(r11)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFMarkedContentExtractor.processTextPosition(com.tom_roush.pdfbox.text.TextPosition):void");
    }

    public void setSuppressDuplicateOverlappingText(boolean z10) {
        this.suppressDuplicateOverlappingText = z10;
    }

    public void xobject(PDXObject pDXObject) {
        if (!this.currentMarkedContents.isEmpty()) {
            this.currentMarkedContents.peek().addXObject(pDXObject);
        }
    }

    public PDFMarkedContentExtractor(String str) {
        this.suppressDuplicateOverlappingText = true;
        this.markedContents = new ArrayList();
        this.currentMarkedContents = new ArrayDeque();
        this.characterListMapping = new HashMap();
        addOperator(new BeginMarkedContentSequenceWithProperties());
        addOperator(new BeginMarkedContentSequence());
        addOperator(new EndMarkedContentSequence());
        addOperator(new DrawObject());
    }
}
