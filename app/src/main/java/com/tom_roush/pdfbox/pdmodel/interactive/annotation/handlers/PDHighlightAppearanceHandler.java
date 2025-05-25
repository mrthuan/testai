package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;

/* loaded from: classes2.dex */
public class PDHighlightAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDHighlightAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4 A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:25:0x0144, B:26:0x0147, B:28:0x014c, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:48:0x01c1, B:50:0x01d4, B:55:0x0213, B:57:0x022a, B:62:0x0265, B:58:0x023f, B:60:0x0249, B:61:0x025e, B:51:0x01eb, B:53:0x01f7, B:54:0x020c, B:38:0x0189, B:40:0x0197, B:42:0x01a3, B:44:0x01af, B:46:0x01bb), top: B:89:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:25:0x0144, B:26:0x0147, B:28:0x014c, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:48:0x01c1, B:50:0x01d4, B:55:0x0213, B:57:0x022a, B:62:0x0265, B:58:0x023f, B:60:0x0249, B:61:0x025e, B:51:0x01eb, B:53:0x01f7, B:54:0x020c, B:38:0x0189, B:40:0x0197, B:42:0x01a3, B:44:0x01af, B:46:0x01bb), top: B:89:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022a A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:25:0x0144, B:26:0x0147, B:28:0x014c, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:48:0x01c1, B:50:0x01d4, B:55:0x0213, B:57:0x022a, B:62:0x0265, B:58:0x023f, B:60:0x0249, B:61:0x025e, B:51:0x01eb, B:53:0x01f7, B:54:0x020c, B:38:0x0189, B:40:0x0197, B:42:0x01a3, B:44:0x01af, B:46:0x01bb), top: B:89:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023f A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:25:0x0144, B:26:0x0147, B:28:0x014c, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:48:0x01c1, B:50:0x01d4, B:55:0x0213, B:57:0x022a, B:62:0x0265, B:58:0x023f, B:60:0x0249, B:61:0x025e, B:51:0x01eb, B:53:0x01f7, B:54:0x020c, B:38:0x0189, B:40:0x0197, B:42:0x01a3, B:44:0x01af, B:46:0x01bb), top: B:89:0x0144 }] */
    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void generateNormalAppearance() {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDHighlightAppearanceHandler.generateNormalAppearance():void");
    }

    public PDHighlightAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
