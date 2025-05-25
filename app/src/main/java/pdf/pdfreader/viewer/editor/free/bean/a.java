package pdf.pdfreader.viewer.editor.free.bean;

import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.bean.IToolsItem;

/* compiled from: ToolsGroup.java */
/* loaded from: classes3.dex */
public final class a implements IToolsItem {

    /* renamed from: a  reason: collision with root package name */
    public final String f24035a;

    public a(String str) {
        new ArrayList();
        this.f24035a = str;
    }

    @Override // pdf.pdfreader.viewer.editor.free.bean.IToolsItem
    public final IToolsItem.ToolsItemType a() {
        return IToolsItem.ToolsItemType.header;
    }
}
