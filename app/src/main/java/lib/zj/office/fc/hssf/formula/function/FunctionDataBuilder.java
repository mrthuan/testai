package lib.zj.office.fc.hssf.formula.function;

import a0.a;
import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class FunctionDataBuilder {
    private final Map _functionDataByIndex;
    private final Map _functionDataByName;
    private int _maxFunctionIndex = -1;
    private final Set _mutatingFunctionIndexes = new HashSet();

    public FunctionDataBuilder(int i10) {
        int i11 = (i10 * 3) / 2;
        this._functionDataByName = new HashMap(i11);
        this._functionDataByIndex = new HashMap(i11);
    }

    public void add(int i10, String str, int i11, int i12, byte b10, byte[] bArr, boolean z10) {
        FunctionMetadata functionMetadata = new FunctionMetadata(i10, str, i11, i12, b10, bArr);
        Integer valueOf = Integer.valueOf(i10);
        if (i10 > this._maxFunctionIndex) {
            this._maxFunctionIndex = i10;
        }
        FunctionMetadata functionMetadata2 = (FunctionMetadata) this._functionDataByName.get(str);
        if (functionMetadata2 != null) {
            if (z10 && this._mutatingFunctionIndexes.contains(valueOf)) {
                this._functionDataByIndex.remove(Integer.valueOf(functionMetadata2.getIndex()));
            } else {
                throw new RuntimeException(h.d("Multiple entries for function name '", str, OperatorName.SHOW_TEXT_LINE));
            }
        }
        FunctionMetadata functionMetadata3 = (FunctionMetadata) this._functionDataByIndex.get(valueOf);
        if (functionMetadata3 != null) {
            if (z10 && this._mutatingFunctionIndexes.contains(valueOf)) {
                this._functionDataByName.remove(functionMetadata3.getName());
            } else {
                throw new RuntimeException(a.g("Multiple entries for function index (", i10, ")"));
            }
        }
        if (z10) {
            this._mutatingFunctionIndexes.add(valueOf);
        }
        this._functionDataByIndex.put(valueOf, functionMetadata);
        this._functionDataByName.put(str, functionMetadata);
    }

    public FunctionMetadataRegistry build() {
        int size = this._functionDataByName.size();
        FunctionMetadata[] functionMetadataArr = new FunctionMetadata[size];
        this._functionDataByName.values().toArray(functionMetadataArr);
        FunctionMetadata[] functionMetadataArr2 = new FunctionMetadata[this._maxFunctionIndex + 1];
        for (int i10 = 0; i10 < size; i10++) {
            FunctionMetadata functionMetadata = functionMetadataArr[i10];
            functionMetadataArr2[functionMetadata.getIndex()] = functionMetadata;
        }
        return new FunctionMetadataRegistry(functionMetadataArr2, this._functionDataByName);
    }
}
