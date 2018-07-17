package com.ishiqing.base;

public class QDItemDescription {
    private Class<?> mKitDemoClass;
    private String mKitName;
    private String mKitDetailDescription;
    private int mIconRes;


    public QDItemDescription(Class<?> kitDemoClass, String kitName) {
        this(kitDemoClass, kitName, 0);
    }


    public QDItemDescription(Class<?> kitDemoClass, String kitName, int iconRes) {
        mKitDemoClass = kitDemoClass;
        mKitName = kitName;
        mIconRes = iconRes;
    }

    public QDItemDescription(Class<?> kitDemoClass, String kitName,
                             String kitDetailDescription, int iconRes) {
        mKitDemoClass = kitDemoClass;
        mKitName = kitName;
        mKitDetailDescription = kitDetailDescription;
        mIconRes = iconRes;
    }

    public void setItemDetailDescription(String kitDetailDescription) {
        mKitDetailDescription = kitDetailDescription;
    }

    public Class<?> getDemoClass() {
        return mKitDemoClass;
    }

    public String getName() {
        return mKitName;
    }

    public String getItemDetailDescription() {
        return mKitDetailDescription;
    }

    public int getIconRes() {
        return mIconRes;
    }
}
