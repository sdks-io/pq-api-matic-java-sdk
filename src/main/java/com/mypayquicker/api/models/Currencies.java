/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * Currencies to be used.
 */
public enum Currencies {
    UNDEFINED,

    AED,

    AFN,

    ALL,

    AMD,

    ANG,

    AOA,

    ARS,

    AUD,

    AWG,

    AZN,

    BAM,

    BBD,

    BDT,

    BGN,

    BHD,

    BIF,

    BMD,

    BND,

    BOB,

    BRL,

    BSD,

    BTN,

    BWP,

    BYR,

    BZD,

    CAD,

    CDF,

    CHF,

    CLP,

    CNY,

    COP,

    CRC,

    CUC,

    CUP,

    CVE,

    CZK,

    DJF,

    DKK,

    DOP,

    DZD,

    EGP,

    ERN,

    ETB,

    EUR,

    FJD,

    FKP,

    GBP,

    GEL,

    GGP,

    GHS,

    GIP,

    GMD,

    GNF,

    GTQ,

    GYD,

    HKD,

    HNL,

    HRK,

    HTG,

    HUF,

    IDR,

    ILS,

    IMP,

    INR,

    IQD,

    IRR,

    ISK,

    JEP,

    JMD,

    JOD,

    JPY,

    KES,

    KGS,

    KHR,

    KMF,

    KPW,

    KRW,

    KWD,

    KYD,

    KZT,

    LAK,

    LBP,

    LKR,

    LRD,

    LSL,

    LYD,

    MAD,

    MDL,

    MGA,

    MKD,

    MMK,

    MNT,

    MOP,

    MRO,

    MUR,

    MVR,

    MWK,

    MXN,

    MYR,

    MZN,

    NAD,

    NGN,

    NIO,

    NOK,

    NPR,

    NZD,

    OMR,

    PAB,

    PEN,

    PGK,

    PHP,

    PKR,

    PLN,

    PYG,

    QAR,

    RON,

    RSD,

    RUB,

    RWF,

    SAR,

    SBD,

    SCR,

    SDG,

    SEK,

    SGD,

    SHP,

    SLL,

    SOS,

    SPL,

    SRD,

    STD,

    SVC,

    SYP,

    SZL,

    THB,

    TJS,

    TMT,

    TND,

    TOP,

    TRY,

    TTD,

    TVD,

    TWD,

    TZS,

    UAH,

    UGX,

    USD,

    UYU,

    UZS,

    VEF,

    VND,

    VUV,

    WST,

    XAF,

    XCD,

    XDR,

    XOF,

    XPF,

    YER,

    ZAR,

    ZMW,

    ZWD,

    CNH,

    CXX,

    MRU,

    SLE,

    SSP;


    private static TreeMap<String, Currencies> valueMap = new TreeMap<>();
    private String value;

    static {
        UNDEFINED.value = "UNDEFINED";
        AED.value = "AED";
        AFN.value = "AFN";
        ALL.value = "ALL";
        AMD.value = "AMD";
        ANG.value = "ANG";
        AOA.value = "AOA";
        ARS.value = "ARS";
        AUD.value = "AUD";
        AWG.value = "AWG";
        AZN.value = "AZN";
        BAM.value = "BAM";
        BBD.value = "BBD";
        BDT.value = "BDT";
        BGN.value = "BGN";
        BHD.value = "BHD";
        BIF.value = "BIF";
        BMD.value = "BMD";
        BND.value = "BND";
        BOB.value = "BOB";
        BRL.value = "BRL";
        BSD.value = "BSD";
        BTN.value = "BTN";
        BWP.value = "BWP";
        BYR.value = "BYR";
        BZD.value = "BZD";
        CAD.value = "CAD";
        CDF.value = "CDF";
        CHF.value = "CHF";
        CLP.value = "CLP";
        CNY.value = "CNY";
        COP.value = "COP";
        CRC.value = "CRC";
        CUC.value = "CUC";
        CUP.value = "CUP";
        CVE.value = "CVE";
        CZK.value = "CZK";
        DJF.value = "DJF";
        DKK.value = "DKK";
        DOP.value = "DOP";
        DZD.value = "DZD";
        EGP.value = "EGP";
        ERN.value = "ERN";
        ETB.value = "ETB";
        EUR.value = "EUR";
        FJD.value = "FJD";
        FKP.value = "FKP";
        GBP.value = "GBP";
        GEL.value = "GEL";
        GGP.value = "GGP";
        GHS.value = "GHS";
        GIP.value = "GIP";
        GMD.value = "GMD";
        GNF.value = "GNF";
        GTQ.value = "GTQ";
        GYD.value = "GYD";
        HKD.value = "HKD";
        HNL.value = "HNL";
        HRK.value = "HRK";
        HTG.value = "HTG";
        HUF.value = "HUF";
        IDR.value = "IDR";
        ILS.value = "ILS";
        IMP.value = "IMP";
        INR.value = "INR";
        IQD.value = "IQD";
        IRR.value = "IRR";
        ISK.value = "ISK";
        JEP.value = "JEP";
        JMD.value = "JMD";
        JOD.value = "JOD";
        JPY.value = "JPY";
        KES.value = "KES";
        KGS.value = "KGS";
        KHR.value = "KHR";
        KMF.value = "KMF";
        KPW.value = "KPW";
        KRW.value = "KRW";
        KWD.value = "KWD";
        KYD.value = "KYD";
        KZT.value = "KZT";
        LAK.value = "LAK";
        LBP.value = "LBP";
        LKR.value = "LKR";
        LRD.value = "LRD";
        LSL.value = "LSL";
        LYD.value = "LYD";
        MAD.value = "MAD";
        MDL.value = "MDL";
        MGA.value = "MGA";
        MKD.value = "MKD";
        MMK.value = "MMK";
        MNT.value = "MNT";
        MOP.value = "MOP";
        MRO.value = "MRO";
        MUR.value = "MUR";
        MVR.value = "MVR";
        MWK.value = "MWK";
        MXN.value = "MXN";
        MYR.value = "MYR";
        MZN.value = "MZN";
        NAD.value = "NAD";
        NGN.value = "NGN";
        NIO.value = "NIO";
        NOK.value = "NOK";
        NPR.value = "NPR";
        NZD.value = "NZD";
        OMR.value = "OMR";
        PAB.value = "PAB";
        PEN.value = "PEN";
        PGK.value = "PGK";
        PHP.value = "PHP";
        PKR.value = "PKR";
        PLN.value = "PLN";
        PYG.value = "PYG";
        QAR.value = "QAR";
        RON.value = "RON";
        RSD.value = "RSD";
        RUB.value = "RUB";
        RWF.value = "RWF";
        SAR.value = "SAR";
        SBD.value = "SBD";
        SCR.value = "SCR";
        SDG.value = "SDG";
        SEK.value = "SEK";
        SGD.value = "SGD";
        SHP.value = "SHP";
        SLL.value = "SLL";
        SOS.value = "SOS";
        SPL.value = "SPL";
        SRD.value = "SRD";
        STD.value = "STD";
        SVC.value = "SVC";
        SYP.value = "SYP";
        SZL.value = "SZL";
        THB.value = "THB";
        TJS.value = "TJS";
        TMT.value = "TMT";
        TND.value = "TND";
        TOP.value = "TOP";
        TRY.value = "TRY";
        TTD.value = "TTD";
        TVD.value = "TVD";
        TWD.value = "TWD";
        TZS.value = "TZS";
        UAH.value = "UAH";
        UGX.value = "UGX";
        USD.value = "USD";
        UYU.value = "UYU";
        UZS.value = "UZS";
        VEF.value = "VEF";
        VND.value = "VND";
        VUV.value = "VUV";
        WST.value = "WST";
        XAF.value = "XAF";
        XCD.value = "XCD";
        XDR.value = "XDR";
        XOF.value = "XOF";
        XPF.value = "XPF";
        YER.value = "YER";
        ZAR.value = "ZAR";
        ZMW.value = "ZMW";
        ZWD.value = "ZWD";
        CNH.value = "CNH";
        CXX.value = "CXX";
        MRU.value = "MRU";
        SLE.value = "SLE";
        SSP.value = "SSP";

        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("AED", AED);
        valueMap.put("AFN", AFN);
        valueMap.put("ALL", ALL);
        valueMap.put("AMD", AMD);
        valueMap.put("ANG", ANG);
        valueMap.put("AOA", AOA);
        valueMap.put("ARS", ARS);
        valueMap.put("AUD", AUD);
        valueMap.put("AWG", AWG);
        valueMap.put("AZN", AZN);
        valueMap.put("BAM", BAM);
        valueMap.put("BBD", BBD);
        valueMap.put("BDT", BDT);
        valueMap.put("BGN", BGN);
        valueMap.put("BHD", BHD);
        valueMap.put("BIF", BIF);
        valueMap.put("BMD", BMD);
        valueMap.put("BND", BND);
        valueMap.put("BOB", BOB);
        valueMap.put("BRL", BRL);
        valueMap.put("BSD", BSD);
        valueMap.put("BTN", BTN);
        valueMap.put("BWP", BWP);
        valueMap.put("BYR", BYR);
        valueMap.put("BZD", BZD);
        valueMap.put("CAD", CAD);
        valueMap.put("CDF", CDF);
        valueMap.put("CHF", CHF);
        valueMap.put("CLP", CLP);
        valueMap.put("CNY", CNY);
        valueMap.put("COP", COP);
        valueMap.put("CRC", CRC);
        valueMap.put("CUC", CUC);
        valueMap.put("CUP", CUP);
        valueMap.put("CVE", CVE);
        valueMap.put("CZK", CZK);
        valueMap.put("DJF", DJF);
        valueMap.put("DKK", DKK);
        valueMap.put("DOP", DOP);
        valueMap.put("DZD", DZD);
        valueMap.put("EGP", EGP);
        valueMap.put("ERN", ERN);
        valueMap.put("ETB", ETB);
        valueMap.put("EUR", EUR);
        valueMap.put("FJD", FJD);
        valueMap.put("FKP", FKP);
        valueMap.put("GBP", GBP);
        valueMap.put("GEL", GEL);
        valueMap.put("GGP", GGP);
        valueMap.put("GHS", GHS);
        valueMap.put("GIP", GIP);
        valueMap.put("GMD", GMD);
        valueMap.put("GNF", GNF);
        valueMap.put("GTQ", GTQ);
        valueMap.put("GYD", GYD);
        valueMap.put("HKD", HKD);
        valueMap.put("HNL", HNL);
        valueMap.put("HRK", HRK);
        valueMap.put("HTG", HTG);
        valueMap.put("HUF", HUF);
        valueMap.put("IDR", IDR);
        valueMap.put("ILS", ILS);
        valueMap.put("IMP", IMP);
        valueMap.put("INR", INR);
        valueMap.put("IQD", IQD);
        valueMap.put("IRR", IRR);
        valueMap.put("ISK", ISK);
        valueMap.put("JEP", JEP);
        valueMap.put("JMD", JMD);
        valueMap.put("JOD", JOD);
        valueMap.put("JPY", JPY);
        valueMap.put("KES", KES);
        valueMap.put("KGS", KGS);
        valueMap.put("KHR", KHR);
        valueMap.put("KMF", KMF);
        valueMap.put("KPW", KPW);
        valueMap.put("KRW", KRW);
        valueMap.put("KWD", KWD);
        valueMap.put("KYD", KYD);
        valueMap.put("KZT", KZT);
        valueMap.put("LAK", LAK);
        valueMap.put("LBP", LBP);
        valueMap.put("LKR", LKR);
        valueMap.put("LRD", LRD);
        valueMap.put("LSL", LSL);
        valueMap.put("LYD", LYD);
        valueMap.put("MAD", MAD);
        valueMap.put("MDL", MDL);
        valueMap.put("MGA", MGA);
        valueMap.put("MKD", MKD);
        valueMap.put("MMK", MMK);
        valueMap.put("MNT", MNT);
        valueMap.put("MOP", MOP);
        valueMap.put("MRO", MRO);
        valueMap.put("MUR", MUR);
        valueMap.put("MVR", MVR);
        valueMap.put("MWK", MWK);
        valueMap.put("MXN", MXN);
        valueMap.put("MYR", MYR);
        valueMap.put("MZN", MZN);
        valueMap.put("NAD", NAD);
        valueMap.put("NGN", NGN);
        valueMap.put("NIO", NIO);
        valueMap.put("NOK", NOK);
        valueMap.put("NPR", NPR);
        valueMap.put("NZD", NZD);
        valueMap.put("OMR", OMR);
        valueMap.put("PAB", PAB);
        valueMap.put("PEN", PEN);
        valueMap.put("PGK", PGK);
        valueMap.put("PHP", PHP);
        valueMap.put("PKR", PKR);
        valueMap.put("PLN", PLN);
        valueMap.put("PYG", PYG);
        valueMap.put("QAR", QAR);
        valueMap.put("RON", RON);
        valueMap.put("RSD", RSD);
        valueMap.put("RUB", RUB);
        valueMap.put("RWF", RWF);
        valueMap.put("SAR", SAR);
        valueMap.put("SBD", SBD);
        valueMap.put("SCR", SCR);
        valueMap.put("SDG", SDG);
        valueMap.put("SEK", SEK);
        valueMap.put("SGD", SGD);
        valueMap.put("SHP", SHP);
        valueMap.put("SLL", SLL);
        valueMap.put("SOS", SOS);
        valueMap.put("SPL", SPL);
        valueMap.put("SRD", SRD);
        valueMap.put("STD", STD);
        valueMap.put("SVC", SVC);
        valueMap.put("SYP", SYP);
        valueMap.put("SZL", SZL);
        valueMap.put("THB", THB);
        valueMap.put("TJS", TJS);
        valueMap.put("TMT", TMT);
        valueMap.put("TND", TND);
        valueMap.put("TOP", TOP);
        valueMap.put("TRY", TRY);
        valueMap.put("TTD", TTD);
        valueMap.put("TVD", TVD);
        valueMap.put("TWD", TWD);
        valueMap.put("TZS", TZS);
        valueMap.put("UAH", UAH);
        valueMap.put("UGX", UGX);
        valueMap.put("USD", USD);
        valueMap.put("UYU", UYU);
        valueMap.put("UZS", UZS);
        valueMap.put("VEF", VEF);
        valueMap.put("VND", VND);
        valueMap.put("VUV", VUV);
        valueMap.put("WST", WST);
        valueMap.put("XAF", XAF);
        valueMap.put("XCD", XCD);
        valueMap.put("XDR", XDR);
        valueMap.put("XOF", XOF);
        valueMap.put("XPF", XPF);
        valueMap.put("YER", YER);
        valueMap.put("ZAR", ZAR);
        valueMap.put("ZMW", ZMW);
        valueMap.put("ZWD", ZWD);
        valueMap.put("CNH", CNH);
        valueMap.put("CXX", CXX);
        valueMap.put("MRU", MRU);
        valueMap.put("SLE", SLE);
        valueMap.put("SSP", SSP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Currencies constructFromString(String toConvert) throws IOException {
        Currencies enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static Currencies fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Currencies values to list of string values.
     * @param toConvert The list of Currencies values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Currencies> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Currencies enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 