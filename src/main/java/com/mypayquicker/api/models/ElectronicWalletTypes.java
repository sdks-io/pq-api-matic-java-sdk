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
 * ElectronicWalletTypes to be used.
 */
public enum ElectronicWalletTypes {
    AIRTEL_MONEY,

    AIRTEL_TIGO_MONEY,

    ALIPAY,

    AMOLE,

    ASTRAPAY,

    AWASH_BIRR,

    AYA_PAY_WALLET,

    BANKILY,

    BIGPAY,

    BILLET_BHD_WALLET,

    BILLETERA_MOVIL_BANPRO,

    BKASH,

    CBE_BIRR,

    CELLPAY,

    COINS,

    DANA,

    DAVIPLATA,

    DIGICEL_MYCASH,

    DINARAK,

    EASY_PAISA_WALLET,

    ECOCASH,

    EQUITEL_MONEY,

    ESEWA,

    EXPRESS_UNION,

    EZ_CASH,

    FDH_BANK_WALLETS,

    FINJA_WALLET,

    GADHA,

    GCASH,

    GOPAY,

    GRABPAY,

    HELLOCASH,

    HORMUUD_EVC,

    ICASH,

    ILLICOCASH,

    IME_PAY,

    IMKAS,

    JAZZ_CASH_WALLET,

    KHALTI_WALLET,

    LENDMN,

    LINKAJA,

    M_PAISA,

    M_PESA,

    MCASH,

    MGURUSH_MOBILE_MONEY,

    MOMO,

    MONCASH,

    MOOV_MONEY,

    MORU,

    MOVII,

    MTN_GUINEA_CONAKRY,

    MTN_MOBILE_MONEY,

    NAMASTEPAY,

    NAYAPAY,

    NEQUI,

    ORANGE_MONEY,

    OVO,

    PAYMAYA,

    PAYTREN,

    PRABHU_PAY,

    PREMIER_WALLET,

    QIWI,

    QPAY,

    SADAPAY,

    SAJILOPAY,

    SHOPEEPAY,

    SMARTCASH_AIRTEL,

    TELEBIRR,

    TIGO_MONEY,

    TIGO_PESA,

    TNG_DIGITAL,

    TNM_WALLETS,

    TRUEMONEY_WALLET,

    UNIPAGO,

    UWALLET,

    VNPAY,

    VNPT_PAY,

    VODAFONE_MONEY,

    WECHATPAY,

    WING_MONEY,

    YOAPP,

    ZAIN_CASH,

    ZALOPAY,

    ZAMTEL_MOBILE_MONEY,

    UNDEFINED;


    private static TreeMap<String, ElectronicWalletTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        AIRTEL_MONEY.value = "AIRTEL_MONEY";
        AIRTEL_TIGO_MONEY.value = "AIRTEL_TIGO_MONEY";
        ALIPAY.value = "ALIPAY";
        AMOLE.value = "AMOLE";
        ASTRAPAY.value = "ASTRAPAY";
        AWASH_BIRR.value = "AWASH_BIRR";
        AYA_PAY_WALLET.value = "AYA_PAY_WALLET";
        BANKILY.value = "BANKILY";
        BIGPAY.value = "BIGPAY";
        BILLET_BHD_WALLET.value = "BILLET_BHD_WALLET";
        BILLETERA_MOVIL_BANPRO.value = "BILLETERA_MOVIL_BANPRO";
        BKASH.value = "BKASH";
        CBE_BIRR.value = "CBE_BIRR";
        CELLPAY.value = "CELLPAY";
        COINS.value = "COINS";
        DANA.value = "DANA";
        DAVIPLATA.value = "DAVIPLATA";
        DIGICEL_MYCASH.value = "DIGICEL_MYCASH";
        DINARAK.value = "DINARAK";
        EASY_PAISA_WALLET.value = "EASY_PAISA_WALLET";
        ECOCASH.value = "ECOCASH";
        EQUITEL_MONEY.value = "EQUITEL_MONEY";
        ESEWA.value = "ESEWA";
        EXPRESS_UNION.value = "EXPRESS_UNION";
        EZ_CASH.value = "EZ_CASH";
        FDH_BANK_WALLETS.value = "FDH_BANK_WALLETS";
        FINJA_WALLET.value = "FINJA_WALLET";
        GADHA.value = "GADHA";
        GCASH.value = "GCASH";
        GOPAY.value = "GOPAY";
        GRABPAY.value = "GRABPAY";
        HELLOCASH.value = "HELLOCASH";
        HORMUUD_EVC.value = "HORMUUD_EVC";
        ICASH.value = "ICASH";
        ILLICOCASH.value = "ILLICOCASH";
        IME_PAY.value = "IME_PAY";
        IMKAS.value = "IMKAS";
        JAZZ_CASH_WALLET.value = "JAZZ_CASH_WALLET";
        KHALTI_WALLET.value = "KHALTI_WALLET";
        LENDMN.value = "LENDMN";
        LINKAJA.value = "LINKAJA";
        M_PAISA.value = "M_PAISA";
        M_PESA.value = "M_PESA";
        MCASH.value = "MCASH";
        MGURUSH_MOBILE_MONEY.value = "MGURUSH_MOBILE_MONEY";
        MOMO.value = "MOMO";
        MONCASH.value = "MONCASH";
        MOOV_MONEY.value = "MOOV_MONEY";
        MORU.value = "MORU";
        MOVII.value = "MOVII";
        MTN_GUINEA_CONAKRY.value = "MTN_GUINEA_CONAKRY";
        MTN_MOBILE_MONEY.value = "MTN_MOBILE_MONEY";
        NAMASTEPAY.value = "NAMASTEPAY";
        NAYAPAY.value = "NAYAPAY";
        NEQUI.value = "NEQUI";
        ORANGE_MONEY.value = "ORANGE_MONEY";
        OVO.value = "OVO";
        PAYMAYA.value = "PAYMAYA";
        PAYTREN.value = "PAYTREN";
        PRABHU_PAY.value = "PRABHU_PAY";
        PREMIER_WALLET.value = "PREMIER_WALLET";
        QIWI.value = "QIWI";
        QPAY.value = "QPAY";
        SADAPAY.value = "SADAPAY";
        SAJILOPAY.value = "SAJILOPAY";
        SHOPEEPAY.value = "SHOPEEPAY";
        SMARTCASH_AIRTEL.value = "SMARTCASH_AIRTEL";
        TELEBIRR.value = "TELEBIRR";
        TIGO_MONEY.value = "TIGO_MONEY";
        TIGO_PESA.value = "TIGO_PESA";
        TNG_DIGITAL.value = "TNG_DIGITAL";
        TNM_WALLETS.value = "TNM_WALLETS";
        TRUEMONEY_WALLET.value = "TRUEMONEY_WALLET";
        UNIPAGO.value = "UNIPAGO";
        UWALLET.value = "UWALLET";
        VNPAY.value = "VNPAY";
        VNPT_PAY.value = "VNPT_PAY";
        VODAFONE_MONEY.value = "VODAFONE_MONEY";
        WECHATPAY.value = "WECHATPAY";
        WING_MONEY.value = "WING_MONEY";
        YOAPP.value = "YOAPP";
        ZAIN_CASH.value = "ZAIN_CASH";
        ZALOPAY.value = "ZALOPAY";
        ZAMTEL_MOBILE_MONEY.value = "ZAMTEL_MOBILE_MONEY";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("AIRTEL_MONEY", AIRTEL_MONEY);
        valueMap.put("AIRTEL_TIGO_MONEY", AIRTEL_TIGO_MONEY);
        valueMap.put("ALIPAY", ALIPAY);
        valueMap.put("AMOLE", AMOLE);
        valueMap.put("ASTRAPAY", ASTRAPAY);
        valueMap.put("AWASH_BIRR", AWASH_BIRR);
        valueMap.put("AYA_PAY_WALLET", AYA_PAY_WALLET);
        valueMap.put("BANKILY", BANKILY);
        valueMap.put("BIGPAY", BIGPAY);
        valueMap.put("BILLET_BHD_WALLET", BILLET_BHD_WALLET);
        valueMap.put("BILLETERA_MOVIL_BANPRO", BILLETERA_MOVIL_BANPRO);
        valueMap.put("BKASH", BKASH);
        valueMap.put("CBE_BIRR", CBE_BIRR);
        valueMap.put("CELLPAY", CELLPAY);
        valueMap.put("COINS", COINS);
        valueMap.put("DANA", DANA);
        valueMap.put("DAVIPLATA", DAVIPLATA);
        valueMap.put("DIGICEL_MYCASH", DIGICEL_MYCASH);
        valueMap.put("DINARAK", DINARAK);
        valueMap.put("EASY_PAISA_WALLET", EASY_PAISA_WALLET);
        valueMap.put("ECOCASH", ECOCASH);
        valueMap.put("EQUITEL_MONEY", EQUITEL_MONEY);
        valueMap.put("ESEWA", ESEWA);
        valueMap.put("EXPRESS_UNION", EXPRESS_UNION);
        valueMap.put("EZ_CASH", EZ_CASH);
        valueMap.put("FDH_BANK_WALLETS", FDH_BANK_WALLETS);
        valueMap.put("FINJA_WALLET", FINJA_WALLET);
        valueMap.put("GADHA", GADHA);
        valueMap.put("GCASH", GCASH);
        valueMap.put("GOPAY", GOPAY);
        valueMap.put("GRABPAY", GRABPAY);
        valueMap.put("HELLOCASH", HELLOCASH);
        valueMap.put("HORMUUD_EVC", HORMUUD_EVC);
        valueMap.put("ICASH", ICASH);
        valueMap.put("ILLICOCASH", ILLICOCASH);
        valueMap.put("IME_PAY", IME_PAY);
        valueMap.put("IMKAS", IMKAS);
        valueMap.put("JAZZ_CASH_WALLET", JAZZ_CASH_WALLET);
        valueMap.put("KHALTI_WALLET", KHALTI_WALLET);
        valueMap.put("LENDMN", LENDMN);
        valueMap.put("LINKAJA", LINKAJA);
        valueMap.put("M_PAISA", M_PAISA);
        valueMap.put("M_PESA", M_PESA);
        valueMap.put("MCASH", MCASH);
        valueMap.put("MGURUSH_MOBILE_MONEY", MGURUSH_MOBILE_MONEY);
        valueMap.put("MOMO", MOMO);
        valueMap.put("MONCASH", MONCASH);
        valueMap.put("MOOV_MONEY", MOOV_MONEY);
        valueMap.put("MORU", MORU);
        valueMap.put("MOVII", MOVII);
        valueMap.put("MTN_GUINEA_CONAKRY", MTN_GUINEA_CONAKRY);
        valueMap.put("MTN_MOBILE_MONEY", MTN_MOBILE_MONEY);
        valueMap.put("NAMASTEPAY", NAMASTEPAY);
        valueMap.put("NAYAPAY", NAYAPAY);
        valueMap.put("NEQUI", NEQUI);
        valueMap.put("ORANGE_MONEY", ORANGE_MONEY);
        valueMap.put("OVO", OVO);
        valueMap.put("PAYMAYA", PAYMAYA);
        valueMap.put("PAYTREN", PAYTREN);
        valueMap.put("PRABHU_PAY", PRABHU_PAY);
        valueMap.put("PREMIER_WALLET", PREMIER_WALLET);
        valueMap.put("QIWI", QIWI);
        valueMap.put("QPAY", QPAY);
        valueMap.put("SADAPAY", SADAPAY);
        valueMap.put("SAJILOPAY", SAJILOPAY);
        valueMap.put("SHOPEEPAY", SHOPEEPAY);
        valueMap.put("SMARTCASH_AIRTEL", SMARTCASH_AIRTEL);
        valueMap.put("TELEBIRR", TELEBIRR);
        valueMap.put("TIGO_MONEY", TIGO_MONEY);
        valueMap.put("TIGO_PESA", TIGO_PESA);
        valueMap.put("TNG_DIGITAL", TNG_DIGITAL);
        valueMap.put("TNM_WALLETS", TNM_WALLETS);
        valueMap.put("TRUEMONEY_WALLET", TRUEMONEY_WALLET);
        valueMap.put("UNIPAGO", UNIPAGO);
        valueMap.put("UWALLET", UWALLET);
        valueMap.put("VNPAY", VNPAY);
        valueMap.put("VNPT_PAY", VNPT_PAY);
        valueMap.put("VODAFONE_MONEY", VODAFONE_MONEY);
        valueMap.put("WECHATPAY", WECHATPAY);
        valueMap.put("WING_MONEY", WING_MONEY);
        valueMap.put("YOAPP", YOAPP);
        valueMap.put("ZAIN_CASH", ZAIN_CASH);
        valueMap.put("ZALOPAY", ZALOPAY);
        valueMap.put("ZAMTEL_MOBILE_MONEY", ZAMTEL_MOBILE_MONEY);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ElectronicWalletTypes constructFromString(String toConvert) throws IOException {
        ElectronicWalletTypes enumValue = fromString(toConvert);
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
    public static ElectronicWalletTypes fromString(String toConvert) {
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
     * Convert list of ElectronicWalletTypes values to list of string values.
     * @param toConvert The list of ElectronicWalletTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ElectronicWalletTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ElectronicWalletTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 