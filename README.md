# 工厂模式
1、简单工厂
     定义：根据传入参数生成对应的实例
     应用场景：创建对象较少，提高代码复用
     优点：客户端无需关心创建细节，传入正确参数即可。
     缺点：扩展性不好（创建的个别对象需要做某些初始化工作时，需要做if else；增加新对象时，可能需要if else），
               工厂方法职责过重（调用者可能需要知道部分细节，防止传错参数），
               不符合开闭原则。

2、工厂方法
     定义：实例化交给具体实现者或子类
     应用场景：提高代码复用
     优点：符合开闭原则，扩展性好，调用者无需关心细节。
     缺点：类的数量增多（与子类个数递增），复杂度增大

3、抽象工厂
    定义：定义一系列相关的多个产品（1个产品族），交由实现着或者子类统一创建
    应用场景：多个产品多个产品族的关系（一系列相关的产品需要统一创建的时候）
    优点：一系列相关的产品统一创建，提高代码复用
    缺点：复杂度增大，新增新产品时麻烦（修改顶级抽象接口，实现者或子类挨个改遍）

通用点：提高代码复用，
差异性：工厂方法模式、抽象工厂模式  都是交由子类实现，简单工厂模式直接顶级工厂实现。场景不一样





# 单例模式
1、饿汉式
     定义：加载类直接创建对象
     优点：简单、线程绝对安全
     缺点：占用内存（有N个对象，不管调用不调用都创建）。

2、懒汉式（双层校验、内部类实现）
     定义：延迟加载，调用时才初始化
     优点：延迟加载。
     缺点：解决线程安全，降低性能

3、注册式（容器缓存、枚举）
    定义：定义hashMap存对象，类完整路径当key，实例当value     枚举:打标记
    应用场景：容器缓存适用于创建很多实例、枚举（防反射、序列化破坏）
    优点：灵活定义多个对象

4、线程单例
     定义：ThreadLocal线程单例，同个线程内是同个实例，不同线程不同实例
     应用场景：数据源配置、时间格式化

破坏单例方式：反射、序列化
反射防止方法: 私有构造方法中判断实例是否存在、存在抛异常
序列化防止方法：重写readResolve()方法，返回实例。（依然会创建2次实例，反射调用readResolve()方法中生成的实例会覆盖之前的实例）


类加载顺序：
1、先静态块和静态变量（有父类，先加载父类）
3、先加载静态块和静态变量，顺序与写的顺序有关
3、再加载变量
4、最后加载构造方法
5、内部类不调用默认不加载


# 原型模式
    定义：不通过构造方法实例化对象
    应用场景：new对象过程复杂，类初始化占资源多，构造方法很复杂，循环体中产生大量对象，可读性下降
    BeanUtil、JsonObject、GUAVA
	
    深克隆：只复制值
    浅克隆：被复制的对象中有引用对象，复制的是引用地址
