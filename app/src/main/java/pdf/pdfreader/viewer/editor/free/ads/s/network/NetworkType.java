// Auto-fixed: added missing class declaration
public class NetworkType {
package pdf.pdfreader.viewer.editor.free.ads.s.network;

/* loaded from: classes3.dex */
public enum NetworkType {
    NETWORK_NULL,
    NETWORK_UNKNOWN,
    NETWORK_WIFI,
    NETWORK_2G,
    NETWORK_3G,
    NETWORK_4G;

    public boolean isDataFlow() {
        if (!equals(NETWORK_2G) && !equals(NETWORK_3G) && !equals(NETWORK_4G)) {
            return false;
        }
        return true;
    }
}

}
