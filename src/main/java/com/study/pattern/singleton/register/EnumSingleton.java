package com.study.pattern.singleton.register;

/**
 * 注册式单例（枚举方式）
 */
public enum  EnumSingleton {
    INSTANCE,INSTANCE2;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void singletonOperation(){
        System.out.println("添加需要的其他操作");
    }
}
