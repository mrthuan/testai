package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfel {
    public final zzbxi zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzffj zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbst zzad;
    public final com.google.android.gms.ads.internal.client.zzs zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbvz zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfeq zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    public zzfel(JsonReader jsonReader) {
        String str;
        List list;
        List list2;
        char c;
        List list3;
        String str2;
        zzbvz zzbvzVar;
        zzbvz zzbvzVar2;
        List list4;
        String str3;
        List list5;
        JSONObject jSONObject;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        ArrayList emptyList9 = Collections.emptyList();
        ArrayList emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        zzfxr.zzm();
        List zzm = zzfxr.zzm();
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        JSONObject jSONObject12 = jSONObject7;
        List list6 = zzm;
        HashMap hashMap2 = hashMap;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i11 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        int i12 = 0;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        int i13 = 0;
        boolean z28 = false;
        String str4 = "";
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        String str20 = str19;
        String str21 = str20;
        zzfeq zzfeqVar = null;
        zzbxi zzbxiVar = null;
        zzbst zzbstVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str22 = null;
        int i14 = -1;
        int i15 = -1;
        ArrayList arrayList = emptyList11;
        List list7 = emptyList12;
        ArrayList arrayList2 = emptyList13;
        List list8 = emptyList14;
        JSONObject jSONObject13 = jSONObject2;
        int i16 = 0;
        int i17 = 0;
        String str23 = str21;
        String str24 = str23;
        zzbvz zzbvzVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName == null) {
                str = "";
            } else {
                str = nextName;
            }
            switch (str.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_name")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_signals")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("omid_settings")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("recursive_server_response_data")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_consent")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("play_prewarm_options")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("parallel_key")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_name")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_interscroller")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("backend_query_id")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("nofill_urls")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_custom_close_blocked")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("orientation")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("enable_omid")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("showable_impression_type")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_cover")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapters")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("test_mode_enabled")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("extras")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_event_value")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_urls")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_type")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_scroll_aware")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("fill_urls")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allocation_id")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_complete_urls")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("active_view")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("valid_from_timestamp")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_id")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("click_urls")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("late_load_urls")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("safe_browsing")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("imp_urls")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rtb_native_required_assets")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_timeout_ms")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_close_time_ms")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("content_url")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_close_button_enabled")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("watermark")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("native_required_asset_viewability")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_offline_ad")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_custom_click_gesture")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(FacebookMediationAdapter.KEY_ID)) {
                        c = PackagingURIHelper.FORWARD_SLASH_CHAR;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("data")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("request_id")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_test_label")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("qdata")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_load_urls")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_closable_area_disabled")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("consent_form_action_identifier")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_timeout_ms")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_dialog_string")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("container_sizes")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("impression_type")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 805095541:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("transaction_id")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rewards")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapter_response_info_key")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("cache_hit_urls")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case 1422388341:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_collapsible")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_id")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("bid_response")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_start_urls")) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_network_class_name")) {
                        c = 'E';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_reward_urls")) {
                        c = 'F';
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("use_third_party_container_height")) {
                        c = 'G';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("renderers")) {
                        c = 'H';
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_analytics_logging_enabled")) {
                        c = 'I';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rule_line_external_id")) {
                        c = 'J';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("manual_tracking_urls")) {
                        c = 'K';
                        break;
                    }
                    c = 65535;
                    break;
                case 2075506442:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str.equals("render_serially")) {
                        c = 'L';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    if (((Boolean) zzbbw.zzgd.zzl()).booleanValue()) {
                        str16 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case 1:
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 2:
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 3:
                    zzbvzVar2 = zzbvzVar3;
                    str19 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 4:
                    zzbvzVar2 = zzbvzVar3;
                    z27 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 5:
                    list4 = emptyList8;
                    str3 = str24;
                    zzbstVar = zzbst.zza(com.google.android.gms.ads.internal.util.zzbs.f(jsonReader));
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case 6:
                    zzbvzVar2 = zzbvzVar3;
                    str21 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 7:
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    if (((Boolean) zzbbw.zzgd.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case '\b':
                    zzbvzVar2 = zzbvzVar3;
                    z21 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '\t':
                    zzbvzVar2 = zzbvzVar3;
                    str11 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '\n':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    emptyList10 = list2;
                    emptyList8 = emptyList8;
                    break;
                case 11:
                    zzbvzVar2 = zzbvzVar3;
                    z15 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '\f':
                    list4 = emptyList8;
                    str3 = str24;
                    i14 = zzd(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case '\r':
                    zzbvzVar2 = zzbvzVar3;
                    z17 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 14:
                    zzbvzVar2 = zzbvzVar3;
                    z25 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 15:
                    zzbvzVar2 = zzbvzVar3;
                    i12 = jsonReader.nextInt();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 16:
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 17:
                    list5 = emptyList8;
                    zzbvzVar2 = zzbvzVar3;
                    list8 = zzfem.zza(jsonReader);
                    jSONObject = jSONObject13;
                    emptyList8 = list5;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 18:
                    zzbvzVar2 = zzbvzVar3;
                    arrayList2 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    str24 = str24;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 19:
                    zzbvzVar2 = zzbvzVar3;
                    z14 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 20:
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 21:
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    JSONObject f10 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    Parcelable.Creator<com.google.android.gms.ads.internal.client.zzs> creator = com.google.android.gms.ads.internal.client.zzs.CREATOR;
                    zzsVar = new com.google.android.gms.ads.internal.client.zzs(f10.getInt("type_num"), f10.getInt("precision_num"), f10.getLong("value"), f10.getString("currency"));
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case 22:
                    zzbvzVar2 = zzbvzVar3;
                    z10 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 23:
                    emptyList10 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    emptyList8 = emptyList8;
                    emptyList9 = list;
                    break;
                case 24:
                    list4 = emptyList8;
                    str3 = str24;
                    i17 = zzb(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case 25:
                    zzbvzVar2 = zzbvzVar3;
                    z19 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 26:
                    zzbvzVar2 = zzbvzVar3;
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 27:
                    zzbvzVar2 = zzbvzVar3;
                    str4 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 28:
                    zzbvzVar2 = zzbvzVar3;
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 29:
                    list4 = emptyList8;
                    str3 = str24;
                    str7 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader).toString();
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case 30:
                    zzbvzVar2 = zzbvzVar3;
                    str24 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 31:
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    if (((Boolean) zzbbw.zzgd.zzl()).booleanValue()) {
                        str17 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case ' ':
                    zzbvzVar2 = zzbvzVar3;
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '!':
                    zzbvzVar2 = zzbvzVar3;
                    list6 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '\"':
                    list4 = emptyList8;
                    str3 = str24;
                    zzbxiVar = zzbxi.zza(com.google.android.gms.ads.internal.util.zzbs.f(jsonReader));
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case '#':
                    zzbvzVar2 = zzbvzVar3;
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '$':
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '%':
                    zzbvzVar2 = zzbvzVar3;
                    i11 = jsonReader.nextInt();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '&':
                    zzbvzVar2 = zzbvzVar3;
                    i15 = jsonReader.nextInt();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '\'':
                    zzbvzVar2 = zzbvzVar3;
                    str22 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '(':
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case ')':
                    zzbvzVar2 = zzbvzVar3;
                    z24 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '*':
                    zzbvzVar2 = zzbvzVar3;
                    str10 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '+':
                    zzbvzVar2 = zzbvzVar3;
                    z23 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case ',':
                    zzbvzVar2 = zzbvzVar3;
                    z22 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '-':
                    zzbvzVar2 = zzbvzVar3;
                    z12 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '.':
                    list4 = emptyList8;
                    str3 = str24;
                    zzfeqVar = new zzfeq(jsonReader);
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case '/':
                    zzbvzVar2 = zzbvzVar3;
                    str5 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '0':
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '1':
                    zzbvzVar2 = zzbvzVar3;
                    str18 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '2':
                    zzbvzVar2 = zzbvzVar3;
                    z13 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '3':
                    zzbvzVar2 = zzbvzVar3;
                    str6 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '4':
                    zzbvzVar2 = zzbvzVar3;
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '5':
                    zzbvzVar2 = zzbvzVar3;
                    z16 = jsonReader.nextBoolean();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '6':
                    zzbvzVar2 = zzbvzVar3;
                    i13 = jsonReader.nextInt();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '7':
                    zzbvzVar2 = zzbvzVar3;
                    i10 = jsonReader.nextInt();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '8':
                    zzbvzVar2 = zzbvzVar3;
                    str8 = jsonReader.nextString();
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '9':
                    list5 = emptyList8;
                    zzbvzVar2 = zzbvzVar3;
                    list7 = zzfem.zza(jsonReader);
                    jSONObject = jSONObject13;
                    emptyList8 = list5;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case ':':
                    list4 = emptyList8;
                    str3 = str24;
                    i16 = zzc(jsonReader.nextInt());
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case ';':
                    if (((Boolean) zzbbw.zzT.zzl()).booleanValue()) {
                        HashMap hashMap3 = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            List list9 = emptyList8;
                            HashMap hashMap4 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                hashMap4.put(jsonReader.nextName(), jsonReader.nextString());
                                zzbvzVar3 = zzbvzVar3;
                                str24 = str24;
                            }
                            jsonReader.endObject();
                            hashMap3.put(nextName2, hashMap4);
                            emptyList8 = list9;
                        }
                        list3 = emptyList8;
                        str2 = str24;
                        zzbvzVar = zzbvzVar3;
                        jsonReader.endObject();
                        hashMap2 = hashMap3;
                    } else {
                        list3 = emptyList8;
                        str2 = str24;
                        zzbvzVar = zzbvzVar3;
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case '<':
                    str23 = jsonReader.nextString();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '=':
                    zzbvzVar3 = zzbvz.zza(com.google.android.gms.ads.internal.util.zzbs.d(jsonReader));
                    list4 = emptyList8;
                    str3 = str24;
                    emptyList10 = list2;
                    emptyList8 = list4;
                    str24 = str3;
                    emptyList9 = list;
                    break;
                case '>':
                    str20 = jsonReader.nextString();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case '?':
                    com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
                case '@':
                    z11 = jsonReader.nextBoolean();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'A':
                    z26 = jsonReader.nextBoolean();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'B':
                    if (((Boolean) zzbbw.zzgd.zzl()).booleanValue()) {
                        list3 = emptyList8;
                        str15 = jsonReader.nextString();
                        str2 = str24;
                        zzbvzVar = zzbvzVar3;
                        emptyList10 = list2;
                        emptyList8 = list3;
                        emptyList9 = list;
                        zzbvzVar3 = zzbvzVar;
                        str24 = str2;
                        break;
                    } else {
                        jsonReader.skipValue();
                        list3 = emptyList8;
                        str2 = str24;
                        zzbvzVar = zzbvzVar3;
                        emptyList10 = list2;
                        emptyList8 = list3;
                        emptyList9 = list;
                        zzbvzVar3 = zzbvzVar;
                        str24 = str2;
                    }
                case 'C':
                    str9 = jsonReader.nextString();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'D':
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'E':
                    str13 = jsonReader.nextString();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'F':
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'G':
                    z20 = jsonReader.nextBoolean();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'H':
                    emptyList = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'I':
                    z18 = jsonReader.nextBoolean();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'J':
                    str12 = jsonReader.nextString();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'K':
                    arrayList = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                case 'L':
                    z28 = jsonReader.nextBoolean();
                    zzbvzVar2 = zzbvzVar3;
                    jSONObject = jSONObject13;
                    jSONObject13 = jSONObject;
                    emptyList10 = list2;
                    zzbvzVar3 = zzbvzVar2;
                    emptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    list3 = emptyList8;
                    str2 = str24;
                    zzbvzVar = zzbvzVar3;
                    emptyList10 = list2;
                    emptyList8 = list3;
                    emptyList9 = list;
                    zzbvzVar3 = zzbvzVar;
                    str24 = str2;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i17;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzf = emptyList4;
        this.zze = i16;
        this.zzg = emptyList5;
        this.zzh = emptyList6;
        this.zzi = emptyList7;
        this.zzj = str23;
        this.zzk = str24;
        this.zzl = zzbvzVar3;
        this.zzm = emptyList8;
        this.zzn = emptyList9;
        this.zzo = emptyList10;
        this.zzp = arrayList;
        this.zzq = i10;
        this.zzr = list7;
        this.zzs = zzfeqVar;
        this.zzt = arrayList2;
        this.zzu = list8;
        this.zzw = str4;
        this.zzv = jSONObject13;
        this.zzx = str5;
        this.zzy = str6;
        this.zzz = str7;
        this.zzA = zzbxiVar;
        this.zzB = str8;
        this.zzC = jSONObject8;
        this.zzD = jSONObject9;
        this.zzJ = z10;
        this.zzK = z11;
        this.zzL = z12;
        this.zzM = z13;
        this.zzN = z14;
        this.zzO = z15;
        this.zzP = z16;
        this.zzQ = i14;
        this.zzR = i11;
        this.zzT = z17;
        this.zzU = str9;
        this.zzV = new zzffj(jSONObject10);
        this.zzW = z18;
        this.zzX = z19;
        this.zzY = i12;
        this.zzZ = str10;
        this.zzaa = i15;
        this.zzab = str11;
        this.zzac = z20;
        this.zzad = zzbstVar;
        this.zzae = zzsVar;
        this.zzaf = str12;
        this.zzag = z21;
        this.zzah = jSONObject11;
        this.zzE = str13;
        this.zzF = str14;
        this.zzG = str15;
        this.zzH = str16;
        this.zzI = str17;
        this.zzai = z22;
        this.zzaj = jSONObject12;
        this.zzak = z23;
        this.zzal = str22;
        this.zzam = z24;
        this.zzS = z25;
        this.zzan = str18;
        this.zzao = str19;
        this.zzap = str20;
        this.zzaq = z26;
        this.zzar = z27;
        this.zzas = i13;
        this.zzau = list6;
        this.zzat = str21;
        this.zzav = z28;
        this.zzaw = hashMap2;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        if ("rewarded_interstitial".equals(str)) {
            return 7;
        }
        return 0;
    }

    private static int zzc(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            return 0;
        }
        return i10;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            return 7;
        }
        return -1;
    }
}
