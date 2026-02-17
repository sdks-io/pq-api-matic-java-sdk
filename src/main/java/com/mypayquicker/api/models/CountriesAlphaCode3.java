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
 * CountriesAlphaCode3 to be used.
 */
public enum CountriesAlphaCode3 {
    AFG,

    ALB,

    ATA,

    DZA,

    ASM,

    AND,

    AGO,

    ATG,

    AZE,

    ARG,

    AUS,

    AUT,

    BHS,

    BHR,

    BGD,

    ARM,

    BRB,

    BEL,

    BMU,

    BTN,

    BOL,

    BIH,

    BWA,

    BVT,

    BRA,

    BLZ,

    IOT,

    SLB,

    VGB,

    BRN,

    BGR,

    MMR,

    BDI,

    BLR,

    KHM,

    CMR,

    CAN,

    CPV,

    CYM,

    CAF,

    LKA,

    TCD,

    CHL,

    CHN,

    TWN,

    CXR,

    CCK,

    COL,

    COM,

    MYT,

    COG,

    COD,

    COK,

    CRI,

    HRV,

    CUB,

    CYP,

    CZE,

    BEN,

    DNK,

    DMA,

    DOM,

    ECU,

    SLV,

    CIV,

    GNQ,

    ETH,

    ERI,

    EST,

    FRO,

    FLK,

    SGS,

    FJI,

    FIN,

    ALA,

    FRA,

    GUF,

    PYF,

    ATF,

    DJI,

    GAB,

    GEO,

    GMB,

    PSE,

    DEU,

    GHA,

    GIB,

    KIR,

    GRC,

    GRL,

    GRD,

    GLP,

    GUM,

    GTM,

    GIN,

    GUY,

    HTI,

    HMD,

    VAT,

    HND,

    HKG,

    HUN,

    ISL,

    IND,

    IDN,

    IRN,

    IRQ,

    IRL,

    ISR,

    ITA,

    JAM,

    JPN,

    KAZ,

    JOR,

    KEN,

    PRK,

    KOR,

    KWT,

    KGZ,

    LAO,

    LBN,

    LSO,

    LVA,

    LBR,

    LBY,

    LIE,

    LTU,

    LUX,

    MAC,

    MDG,

    MWI,

    MYS,

    MDV,

    MLI,

    MLT,

    MTQ,

    MRT,

    MUS,

    MEX,

    MCO,

    MNG,

    MDA,

    MNE,

    MSR,

    MAR,

    MOZ,

    OMN,

    NAM,

    NRU,

    NPL,

    NLD,

    ANT,

    CUW,

    ABW,

    SXM,

    BES,

    NCL,

    VUT,

    NZL,

    NIC,

    NER,

    NGA,

    NIU,

    NFK,

    NOR,

    MNP,

    UMI,

    FSM,

    MHL,

    PLW,

    PAK,

    PAN,

    PNG,

    PRY,

    PER,

    PHL,

    PCN,

    POL,

    PRT,

    GNB,

    TLS,

    PRI,

    QAT,

    REU,

    ROU,

    RUS,

    RWA,

    BLM,

    SHN,

    KNA,

    AIA,

    LCA,

    MAF,

    SPM,

    VCT,

    SMR,

    STP,

    SAU,

    SEN,

    SRB,

    SYC,

    SLE,

    SGP,

    SVK,

    VNM,

    SVN,

    SOM,

    ZAF,

    ZWE,

    ESP,

    SSD,

    ESH,

    SDN,

    SUR,

    SJM,

    SWZ,

    SWE,

    CHE,

    SYR,

    TJK,

    THA,

    TGO,

    TKL,

    TON,

    TTO,

    ARE,

    TUN,

    TUR,

    TKM,

    TCA,

    TUV,

    UGA,

    UKR,

    MKD,

    EGY,

    GBR,

    GGY,

    JEY,

    IMN,

    TZA,

    USA,

    VIR,

    BFA,

    URY,

    UZB,

    VEN,

    WLF,

    WSM,

    YEM,

    ZMB;


    private static TreeMap<String, CountriesAlphaCode3> valueMap = new TreeMap<>();
    private String value;

    static {
        AFG.value = "AFG";
        ALB.value = "ALB";
        ATA.value = "ATA";
        DZA.value = "DZA";
        ASM.value = "ASM";
        AND.value = "AND";
        AGO.value = "AGO";
        ATG.value = "ATG";
        AZE.value = "AZE";
        ARG.value = "ARG";
        AUS.value = "AUS";
        AUT.value = "AUT";
        BHS.value = "BHS";
        BHR.value = "BHR";
        BGD.value = "BGD";
        ARM.value = "ARM";
        BRB.value = "BRB";
        BEL.value = "BEL";
        BMU.value = "BMU";
        BTN.value = "BTN";
        BOL.value = "BOL";
        BIH.value = "BIH";
        BWA.value = "BWA";
        BVT.value = "BVT";
        BRA.value = "BRA";
        BLZ.value = "BLZ";
        IOT.value = "IOT";
        SLB.value = "SLB";
        VGB.value = "VGB";
        BRN.value = "BRN";
        BGR.value = "BGR";
        MMR.value = "MMR";
        BDI.value = "BDI";
        BLR.value = "BLR";
        KHM.value = "KHM";
        CMR.value = "CMR";
        CAN.value = "CAN";
        CPV.value = "CPV";
        CYM.value = "CYM";
        CAF.value = "CAF";
        LKA.value = "LKA";
        TCD.value = "TCD";
        CHL.value = "CHL";
        CHN.value = "CHN";
        TWN.value = "TWN";
        CXR.value = "CXR";
        CCK.value = "CCK";
        COL.value = "COL";
        COM.value = "COM";
        MYT.value = "MYT";
        COG.value = "COG";
        COD.value = "COD";
        COK.value = "COK";
        CRI.value = "CRI";
        HRV.value = "HRV";
        CUB.value = "CUB";
        CYP.value = "CYP";
        CZE.value = "CZE";
        BEN.value = "BEN";
        DNK.value = "DNK";
        DMA.value = "DMA";
        DOM.value = "DOM";
        ECU.value = "ECU";
        SLV.value = "SLV";
        CIV.value = "CIV";
        GNQ.value = "GNQ";
        ETH.value = "ETH";
        ERI.value = "ERI";
        EST.value = "EST";
        FRO.value = "FRO";
        FLK.value = "FLK";
        SGS.value = "SGS";
        FJI.value = "FJI";
        FIN.value = "FIN";
        ALA.value = "ALA";
        FRA.value = "FRA";
        GUF.value = "GUF";
        PYF.value = "PYF";
        ATF.value = "ATF";
        DJI.value = "DJI";
        GAB.value = "GAB";
        GEO.value = "GEO";
        GMB.value = "GMB";
        PSE.value = "PSE";
        DEU.value = "DEU";
        GHA.value = "GHA";
        GIB.value = "GIB";
        KIR.value = "KIR";
        GRC.value = "GRC";
        GRL.value = "GRL";
        GRD.value = "GRD";
        GLP.value = "GLP";
        GUM.value = "GUM";
        GTM.value = "GTM";
        GIN.value = "GIN";
        GUY.value = "GUY";
        HTI.value = "HTI";
        HMD.value = "HMD";
        VAT.value = "VAT";
        HND.value = "HND";
        HKG.value = "HKG";
        HUN.value = "HUN";
        ISL.value = "ISL";
        IND.value = "IND";
        IDN.value = "IDN";
        IRN.value = "IRN";
        IRQ.value = "IRQ";
        IRL.value = "IRL";
        ISR.value = "ISR";
        ITA.value = "ITA";
        JAM.value = "JAM";
        JPN.value = "JPN";
        KAZ.value = "KAZ";
        JOR.value = "JOR";
        KEN.value = "KEN";
        PRK.value = "PRK";
        KOR.value = "KOR";
        KWT.value = "KWT";
        KGZ.value = "KGZ";
        LAO.value = "LAO";
        LBN.value = "LBN";
        LSO.value = "LSO";
        LVA.value = "LVA";
        LBR.value = "LBR";
        LBY.value = "LBY";
        LIE.value = "LIE";
        LTU.value = "LTU";
        LUX.value = "LUX";
        MAC.value = "MAC";
        MDG.value = "MDG";
        MWI.value = "MWI";
        MYS.value = "MYS";
        MDV.value = "MDV";
        MLI.value = "MLI";
        MLT.value = "MLT";
        MTQ.value = "MTQ";
        MRT.value = "MRT";
        MUS.value = "MUS";
        MEX.value = "MEX";
        MCO.value = "MCO";
        MNG.value = "MNG";
        MDA.value = "MDA";
        MNE.value = "MNE";
        MSR.value = "MSR";
        MAR.value = "MAR";
        MOZ.value = "MOZ";
        OMN.value = "OMN";
        NAM.value = "NAM";
        NRU.value = "NRU";
        NPL.value = "NPL";
        NLD.value = "NLD";
        ANT.value = "ANT";
        CUW.value = "CUW";
        ABW.value = "ABW";
        SXM.value = "SXM";
        BES.value = "BES";
        NCL.value = "NCL";
        VUT.value = "VUT";
        NZL.value = "NZL";
        NIC.value = "NIC";
        NER.value = "NER";
        NGA.value = "NGA";
        NIU.value = "NIU";
        NFK.value = "NFK";
        NOR.value = "NOR";
        MNP.value = "MNP";
        UMI.value = "UMI";
        FSM.value = "FSM";
        MHL.value = "MHL";
        PLW.value = "PLW";
        PAK.value = "PAK";
        PAN.value = "PAN";
        PNG.value = "PNG";
        PRY.value = "PRY";
        PER.value = "PER";
        PHL.value = "PHL";
        PCN.value = "PCN";
        POL.value = "POL";
        PRT.value = "PRT";
        GNB.value = "GNB";
        TLS.value = "TLS";
        PRI.value = "PRI";
        QAT.value = "QAT";
        REU.value = "REU";
        ROU.value = "ROU";
        RUS.value = "RUS";
        RWA.value = "RWA";
        BLM.value = "BLM";
        SHN.value = "SHN";
        KNA.value = "KNA";
        AIA.value = "AIA";
        LCA.value = "LCA";
        MAF.value = "MAF";
        SPM.value = "SPM";
        VCT.value = "VCT";
        SMR.value = "SMR";
        STP.value = "STP";
        SAU.value = "SAU";
        SEN.value = "SEN";
        SRB.value = "SRB";
        SYC.value = "SYC";
        SLE.value = "SLE";
        SGP.value = "SGP";
        SVK.value = "SVK";
        VNM.value = "VNM";
        SVN.value = "SVN";
        SOM.value = "SOM";
        ZAF.value = "ZAF";
        ZWE.value = "ZWE";
        ESP.value = "ESP";
        SSD.value = "SSD";
        ESH.value = "ESH";
        SDN.value = "SDN";
        SUR.value = "SUR";
        SJM.value = "SJM";
        SWZ.value = "SWZ";
        SWE.value = "SWE";
        CHE.value = "CHE";
        SYR.value = "SYR";
        TJK.value = "TJK";
        THA.value = "THA";
        TGO.value = "TGO";
        TKL.value = "TKL";
        TON.value = "TON";
        TTO.value = "TTO";
        ARE.value = "ARE";
        TUN.value = "TUN";
        TUR.value = "TUR";
        TKM.value = "TKM";
        TCA.value = "TCA";
        TUV.value = "TUV";
        UGA.value = "UGA";
        UKR.value = "UKR";
        MKD.value = "MKD";
        EGY.value = "EGY";
        GBR.value = "GBR";
        GGY.value = "GGY";
        JEY.value = "JEY";
        IMN.value = "IMN";
        TZA.value = "TZA";
        USA.value = "USA";
        VIR.value = "VIR";
        BFA.value = "BFA";
        URY.value = "URY";
        UZB.value = "UZB";
        VEN.value = "VEN";
        WLF.value = "WLF";
        WSM.value = "WSM";
        YEM.value = "YEM";
        ZMB.value = "ZMB";

        valueMap.put("AFG", AFG);
        valueMap.put("ALB", ALB);
        valueMap.put("ATA", ATA);
        valueMap.put("DZA", DZA);
        valueMap.put("ASM", ASM);
        valueMap.put("AND", AND);
        valueMap.put("AGO", AGO);
        valueMap.put("ATG", ATG);
        valueMap.put("AZE", AZE);
        valueMap.put("ARG", ARG);
        valueMap.put("AUS", AUS);
        valueMap.put("AUT", AUT);
        valueMap.put("BHS", BHS);
        valueMap.put("BHR", BHR);
        valueMap.put("BGD", BGD);
        valueMap.put("ARM", ARM);
        valueMap.put("BRB", BRB);
        valueMap.put("BEL", BEL);
        valueMap.put("BMU", BMU);
        valueMap.put("BTN", BTN);
        valueMap.put("BOL", BOL);
        valueMap.put("BIH", BIH);
        valueMap.put("BWA", BWA);
        valueMap.put("BVT", BVT);
        valueMap.put("BRA", BRA);
        valueMap.put("BLZ", BLZ);
        valueMap.put("IOT", IOT);
        valueMap.put("SLB", SLB);
        valueMap.put("VGB", VGB);
        valueMap.put("BRN", BRN);
        valueMap.put("BGR", BGR);
        valueMap.put("MMR", MMR);
        valueMap.put("BDI", BDI);
        valueMap.put("BLR", BLR);
        valueMap.put("KHM", KHM);
        valueMap.put("CMR", CMR);
        valueMap.put("CAN", CAN);
        valueMap.put("CPV", CPV);
        valueMap.put("CYM", CYM);
        valueMap.put("CAF", CAF);
        valueMap.put("LKA", LKA);
        valueMap.put("TCD", TCD);
        valueMap.put("CHL", CHL);
        valueMap.put("CHN", CHN);
        valueMap.put("TWN", TWN);
        valueMap.put("CXR", CXR);
        valueMap.put("CCK", CCK);
        valueMap.put("COL", COL);
        valueMap.put("COM", COM);
        valueMap.put("MYT", MYT);
        valueMap.put("COG", COG);
        valueMap.put("COD", COD);
        valueMap.put("COK", COK);
        valueMap.put("CRI", CRI);
        valueMap.put("HRV", HRV);
        valueMap.put("CUB", CUB);
        valueMap.put("CYP", CYP);
        valueMap.put("CZE", CZE);
        valueMap.put("BEN", BEN);
        valueMap.put("DNK", DNK);
        valueMap.put("DMA", DMA);
        valueMap.put("DOM", DOM);
        valueMap.put("ECU", ECU);
        valueMap.put("SLV", SLV);
        valueMap.put("CIV", CIV);
        valueMap.put("GNQ", GNQ);
        valueMap.put("ETH", ETH);
        valueMap.put("ERI", ERI);
        valueMap.put("EST", EST);
        valueMap.put("FRO", FRO);
        valueMap.put("FLK", FLK);
        valueMap.put("SGS", SGS);
        valueMap.put("FJI", FJI);
        valueMap.put("FIN", FIN);
        valueMap.put("ALA", ALA);
        valueMap.put("FRA", FRA);
        valueMap.put("GUF", GUF);
        valueMap.put("PYF", PYF);
        valueMap.put("ATF", ATF);
        valueMap.put("DJI", DJI);
        valueMap.put("GAB", GAB);
        valueMap.put("GEO", GEO);
        valueMap.put("GMB", GMB);
        valueMap.put("PSE", PSE);
        valueMap.put("DEU", DEU);
        valueMap.put("GHA", GHA);
        valueMap.put("GIB", GIB);
        valueMap.put("KIR", KIR);
        valueMap.put("GRC", GRC);
        valueMap.put("GRL", GRL);
        valueMap.put("GRD", GRD);
        valueMap.put("GLP", GLP);
        valueMap.put("GUM", GUM);
        valueMap.put("GTM", GTM);
        valueMap.put("GIN", GIN);
        valueMap.put("GUY", GUY);
        valueMap.put("HTI", HTI);
        valueMap.put("HMD", HMD);
        valueMap.put("VAT", VAT);
        valueMap.put("HND", HND);
        valueMap.put("HKG", HKG);
        valueMap.put("HUN", HUN);
        valueMap.put("ISL", ISL);
        valueMap.put("IND", IND);
        valueMap.put("IDN", IDN);
        valueMap.put("IRN", IRN);
        valueMap.put("IRQ", IRQ);
        valueMap.put("IRL", IRL);
        valueMap.put("ISR", ISR);
        valueMap.put("ITA", ITA);
        valueMap.put("JAM", JAM);
        valueMap.put("JPN", JPN);
        valueMap.put("KAZ", KAZ);
        valueMap.put("JOR", JOR);
        valueMap.put("KEN", KEN);
        valueMap.put("PRK", PRK);
        valueMap.put("KOR", KOR);
        valueMap.put("KWT", KWT);
        valueMap.put("KGZ", KGZ);
        valueMap.put("LAO", LAO);
        valueMap.put("LBN", LBN);
        valueMap.put("LSO", LSO);
        valueMap.put("LVA", LVA);
        valueMap.put("LBR", LBR);
        valueMap.put("LBY", LBY);
        valueMap.put("LIE", LIE);
        valueMap.put("LTU", LTU);
        valueMap.put("LUX", LUX);
        valueMap.put("MAC", MAC);
        valueMap.put("MDG", MDG);
        valueMap.put("MWI", MWI);
        valueMap.put("MYS", MYS);
        valueMap.put("MDV", MDV);
        valueMap.put("MLI", MLI);
        valueMap.put("MLT", MLT);
        valueMap.put("MTQ", MTQ);
        valueMap.put("MRT", MRT);
        valueMap.put("MUS", MUS);
        valueMap.put("MEX", MEX);
        valueMap.put("MCO", MCO);
        valueMap.put("MNG", MNG);
        valueMap.put("MDA", MDA);
        valueMap.put("MNE", MNE);
        valueMap.put("MSR", MSR);
        valueMap.put("MAR", MAR);
        valueMap.put("MOZ", MOZ);
        valueMap.put("OMN", OMN);
        valueMap.put("NAM", NAM);
        valueMap.put("NRU", NRU);
        valueMap.put("NPL", NPL);
        valueMap.put("NLD", NLD);
        valueMap.put("ANT", ANT);
        valueMap.put("CUW", CUW);
        valueMap.put("ABW", ABW);
        valueMap.put("SXM", SXM);
        valueMap.put("BES", BES);
        valueMap.put("NCL", NCL);
        valueMap.put("VUT", VUT);
        valueMap.put("NZL", NZL);
        valueMap.put("NIC", NIC);
        valueMap.put("NER", NER);
        valueMap.put("NGA", NGA);
        valueMap.put("NIU", NIU);
        valueMap.put("NFK", NFK);
        valueMap.put("NOR", NOR);
        valueMap.put("MNP", MNP);
        valueMap.put("UMI", UMI);
        valueMap.put("FSM", FSM);
        valueMap.put("MHL", MHL);
        valueMap.put("PLW", PLW);
        valueMap.put("PAK", PAK);
        valueMap.put("PAN", PAN);
        valueMap.put("PNG", PNG);
        valueMap.put("PRY", PRY);
        valueMap.put("PER", PER);
        valueMap.put("PHL", PHL);
        valueMap.put("PCN", PCN);
        valueMap.put("POL", POL);
        valueMap.put("PRT", PRT);
        valueMap.put("GNB", GNB);
        valueMap.put("TLS", TLS);
        valueMap.put("PRI", PRI);
        valueMap.put("QAT", QAT);
        valueMap.put("REU", REU);
        valueMap.put("ROU", ROU);
        valueMap.put("RUS", RUS);
        valueMap.put("RWA", RWA);
        valueMap.put("BLM", BLM);
        valueMap.put("SHN", SHN);
        valueMap.put("KNA", KNA);
        valueMap.put("AIA", AIA);
        valueMap.put("LCA", LCA);
        valueMap.put("MAF", MAF);
        valueMap.put("SPM", SPM);
        valueMap.put("VCT", VCT);
        valueMap.put("SMR", SMR);
        valueMap.put("STP", STP);
        valueMap.put("SAU", SAU);
        valueMap.put("SEN", SEN);
        valueMap.put("SRB", SRB);
        valueMap.put("SYC", SYC);
        valueMap.put("SLE", SLE);
        valueMap.put("SGP", SGP);
        valueMap.put("SVK", SVK);
        valueMap.put("VNM", VNM);
        valueMap.put("SVN", SVN);
        valueMap.put("SOM", SOM);
        valueMap.put("ZAF", ZAF);
        valueMap.put("ZWE", ZWE);
        valueMap.put("ESP", ESP);
        valueMap.put("SSD", SSD);
        valueMap.put("ESH", ESH);
        valueMap.put("SDN", SDN);
        valueMap.put("SUR", SUR);
        valueMap.put("SJM", SJM);
        valueMap.put("SWZ", SWZ);
        valueMap.put("SWE", SWE);
        valueMap.put("CHE", CHE);
        valueMap.put("SYR", SYR);
        valueMap.put("TJK", TJK);
        valueMap.put("THA", THA);
        valueMap.put("TGO", TGO);
        valueMap.put("TKL", TKL);
        valueMap.put("TON", TON);
        valueMap.put("TTO", TTO);
        valueMap.put("ARE", ARE);
        valueMap.put("TUN", TUN);
        valueMap.put("TUR", TUR);
        valueMap.put("TKM", TKM);
        valueMap.put("TCA", TCA);
        valueMap.put("TUV", TUV);
        valueMap.put("UGA", UGA);
        valueMap.put("UKR", UKR);
        valueMap.put("MKD", MKD);
        valueMap.put("EGY", EGY);
        valueMap.put("GBR", GBR);
        valueMap.put("GGY", GGY);
        valueMap.put("JEY", JEY);
        valueMap.put("IMN", IMN);
        valueMap.put("TZA", TZA);
        valueMap.put("USA", USA);
        valueMap.put("VIR", VIR);
        valueMap.put("BFA", BFA);
        valueMap.put("URY", URY);
        valueMap.put("UZB", UZB);
        valueMap.put("VEN", VEN);
        valueMap.put("WLF", WLF);
        valueMap.put("WSM", WSM);
        valueMap.put("YEM", YEM);
        valueMap.put("ZMB", ZMB);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CountriesAlphaCode3 constructFromString(String toConvert) throws IOException {
        CountriesAlphaCode3 enumValue = fromString(toConvert);
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
    public static CountriesAlphaCode3 fromString(String toConvert) {
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
     * Convert list of CountriesAlphaCode3 values to list of string values.
     * @param toConvert The list of CountriesAlphaCode3 values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CountriesAlphaCode3> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CountriesAlphaCode3 enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 