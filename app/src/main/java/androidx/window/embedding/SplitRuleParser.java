package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import androidx.window.core.ExperimentalWindowApi;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: SplitRuleParser.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        boolean z10;
        if (charSequence != null) {
            if (charSequence.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, g.h(obj, str));
                }
                int U = k.U(obj, PackagingURIHelper.FORWARD_SLASH_CHAR, 0, false, 6);
                if (U > 0) {
                    str = obj.substring(0, U);
                    g.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    obj = obj.substring(U + 1);
                    g.d(obj, "(this as java.lang.String).substring(startIndex)");
                }
                if (!g.a(obj, "*") && k.U(obj, '.', 0, false, 6) < 0) {
                    return new ComponentName(str, str + '.' + obj);
                }
                return new ComponentName(str, obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        g.d(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule(EmptySet.INSTANCE, context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        g.d(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        float f10 = obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i10 = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(EmptySet.INSTANCE, obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f10, i10);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f10 = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i10 = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        g.d(packageName, "packageName");
        ComponentName buildClassName = buildClassName(packageName, string);
        EmptySet emptySet = EmptySet.INSTANCE;
        Intent component = new Intent().setComponent(buildClassName);
        g.d(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(emptySet, component, dimension, dimension2, f10, i10);
    }

    private final Set<EmbeddingRule> parseSplitXml(Context context, int i10) {
        SplitPlaceholderRule plus$window_release;
        ActivityRule plus$window_release2;
        SplitPairRule parseSplitPairRule;
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            g.d(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            ActivityRule activityRule = null;
            SplitPairRule splitPairRule = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() == 2 && !g.a("split-config", xml.getName())) {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule == null && splitPlaceholderRule == null) {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    ActivityFilter parseActivityFilter = parseActivityFilter(context, xml);
                                    if (activityRule != null) {
                                        hashSet.remove(activityRule);
                                        plus$window_release2 = activityRule.plus$window_release(parseActivityFilter);
                                        hashSet.add(plus$window_release2);
                                        activityRule = plus$window_release2;
                                        break;
                                    } else if (splitPlaceholderRule != null) {
                                        hashSet.remove(splitPlaceholderRule);
                                        plus$window_release = splitPlaceholderRule.plus$window_release(parseActivityFilter);
                                        hashSet.add(plus$window_release);
                                        splitPlaceholderRule = plus$window_release;
                                        break;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    parseSplitPairRule = parseSplitPairRule(context, xml);
                                    hashSet.add(parseSplitPairRule);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule = parseSplitPairRule;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule != null) {
                                        SplitPairFilter parseSplitPairFilter = parseSplitPairFilter(context, xml);
                                        hashSet.remove(splitPairRule);
                                        parseSplitPairRule = splitPairRule.plus$window_release(parseSplitPairFilter);
                                        hashSet.add(parseSplitPairRule);
                                        splitPairRule = parseSplitPairRule;
                                        break;
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    plus$window_release2 = parseSplitActivityRule(context, xml);
                                    hashSet.add(plus$window_release2);
                                    splitPairRule = null;
                                    splitPlaceholderRule = null;
                                    activityRule = plus$window_release2;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    plus$window_release = parseSplitPlaceholderRule(context, xml);
                                    hashSet.add(plus$window_release);
                                    activityRule = null;
                                    splitPairRule = null;
                                    splitPlaceholderRule = plus$window_release;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                } else {
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i10) {
        g.e(context, "context");
        return parseSplitXml(context, i10);
    }
}
