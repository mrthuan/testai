package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.ListFormatOverride;
import lib.zj.office.fc.hwpf.model.POIListData;
import lib.zj.office.fc.hwpf.model.StyleSheet;
import lib.zj.office.fc.hwpf.sprm.CharacterSprmCompressor;
import lib.zj.office.fc.hwpf.sprm.ParagraphSprmCompressor;

/* loaded from: classes3.dex */
public final class HWPFList {
    private POIListData _listData;
    private ListFormatOverride _override;
    private boolean _registered;
    private StyleSheet _styleSheet;

    public HWPFList(boolean z10, StyleSheet styleSheet) {
        this._listData = new POIListData((int) (Math.random() * System.currentTimeMillis()), z10);
        this._override = new ListFormatOverride(this._listData.getLsid());
        this._styleSheet = styleSheet;
    }

    public POIListData getListData() {
        return this._listData;
    }

    public ListFormatOverride getOverride() {
        return this._override;
    }

    public void setLevelNumberProperties(int i10, CharacterProperties characterProperties) {
        this._listData.getLevel(i10).setNumberProperties(CharacterSprmCompressor.compressCharacterProperty(characterProperties, this._styleSheet.getCharacterStyle(this._listData.getLevelStyle(i10))));
    }

    public void setLevelParagraphProperties(int i10, ParagraphProperties paragraphProperties) {
        this._listData.getLevel(i10).setLevelProperties(ParagraphSprmCompressor.compressParagraphProperty(paragraphProperties, this._styleSheet.getParagraphStyle(this._listData.getLevelStyle(i10))));
    }

    public void setLevelStyle(int i10, int i11) {
        this._listData.setLevelStyle(i10, i11);
    }
}
