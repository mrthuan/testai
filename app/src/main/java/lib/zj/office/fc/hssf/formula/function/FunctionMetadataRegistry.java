package lib.zj.office.fc.hssf.formula.function;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class FunctionMetadataRegistry {
    public static final int FUNCTION_INDEX_CHOOSE = 100;
    public static final short FUNCTION_INDEX_EXTERNAL = 255;
    public static final int FUNCTION_INDEX_IF = 1;
    public static final short FUNCTION_INDEX_INDIRECT = 148;
    public static final short FUNCTION_INDEX_SUM = 4;
    public static final String FUNCTION_NAME_IF = "IF";
    private static FunctionMetadataRegistry _instance;
    private final FunctionMetadata[] _functionDataByIndex;
    private final Map<String, FunctionMetadata> _functionDataByName;

    public FunctionMetadataRegistry(FunctionMetadata[] functionMetadataArr, Map<String, FunctionMetadata> map) {
        this._functionDataByIndex = functionMetadataArr;
        this._functionDataByName = map;
    }

    public static FunctionMetadata getFunctionByIndex(int i10) {
        return getInstance().getFunctionByIndexInternal(i10);
    }

    private FunctionMetadata getFunctionByIndexInternal(int i10) {
        return this._functionDataByIndex[i10];
    }

    public static FunctionMetadata getFunctionByName(String str) {
        return getInstance().getFunctionByNameInternal(str);
    }

    private FunctionMetadata getFunctionByNameInternal(String str) {
        return this._functionDataByName.get(str);
    }

    private static FunctionMetadataRegistry getInstance() {
        if (_instance == null) {
            _instance = FunctionMetadataReader.createRegistry();
        }
        return _instance;
    }

    public static short lookupIndexByName(String str) {
        FunctionMetadata functionByNameInternal = getInstance().getFunctionByNameInternal(str);
        if (functionByNameInternal == null) {
            return (short) -1;
        }
        return (short) functionByNameInternal.getIndex();
    }

    public Set<String> getAllFunctionNames() {
        return this._functionDataByName.keySet();
    }
}
