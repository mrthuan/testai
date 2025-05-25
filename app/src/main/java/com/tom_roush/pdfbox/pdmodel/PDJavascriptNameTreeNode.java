package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDJavascriptNameTreeNode extends PDNameTreeNode<PDActionJavaScript> {
    public PDJavascriptNameTreeNode() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDNameTreeNode<PDActionJavaScript> createChildNode(COSDictionary cOSDictionary) {
        return new PDJavascriptNameTreeNode(cOSDictionary);
    }

    public PDJavascriptNameTreeNode(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDActionJavaScript convertCOSToPD(COSBase cOSBase) {
        if (cOSBase instanceof COSDictionary) {
            return (PDActionJavaScript) PDActionFactory.createAction((COSDictionary) cOSBase);
        }
        throw new IOException("Error creating Javascript object, expected a COSDictionary and not " + cOSBase);
    }
}
