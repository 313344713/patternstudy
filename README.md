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

# 代理模式
    定义：通过代理对象实现被代理对象的功能
    作用：增强被代理对象功能
    
    1、静态代理
    2、动态代理（jdk、cglib）
        jdk实现方式：implements InvocationHandler 接口
       （1）jdk动态代理必须有个接口，不然没法覆盖重写
       （2）jdk和cglib 最根本的区别 jdk是实现接口，cglib 是继承接口
       
      为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？
      class文件是一组8字节为基础的二进制流，interface_count占2字节。也就是16.00000000,00000000 所以，证明
      interface_count的数量最多是2^16次方 最大值=65535
      
      
      
      jdk动态代理原理:$Proxy
          读取接口的信息，反射。
          1.拿到被代理类的引用，并且获取它所有的接口(反射获取)
          2.JDK Proxy类重新生成一个新的类， 实现了被代理类所有接口中的方法
          3.动态生成Java代码，把增强逻辑加入到新生成代码中。
          4.编译生成新的Java代码。
          5.加载并重新运行新的class，得到类就是全新类。
      
      cglib
          使用asm框架，直接写字节码
          可以代理一个普通的类
          坑:final方法不能代理
      
      jdk vs cglib
          1.jdk动态代理是实现了被代理对象的接口，cglib是继承了被代理对象
          2.jdk和cglib都是在运行期生成字节码
              jdk是直接写class字节码
              cglib使用asm框架写class,cglib代理实现更复杂，生成代理类比jdk效率低。
          3.jdk调用代理方法，是通过反射机制调用，
              cglib是通过FastClass机制直接调用方法，cglib执行效率更高
      
      Spring中的代理选择原则
          1.当Bean有实现接口时，Spring就会用jdk动态代理
          2.当Bean没有实现接口时，Spring选择cglib
          3.Spring可以通过配置强制使用cglib，只需在Spring配置文件中加入代码:
              <aop:aspectj-autoproxy proxy-target-class="true"/>
      
      代理模式优点
          1.代理模式能将代理对象与真实被调用的目标对象分离
          2.一定程度上降低了系统的耦合程度，易于扩展
          3.代理可以起到保护目标对象的作用
          4.增强目标对象的职责

# 委派模式
    定义：负责任务的调度和分配
    代理注重过程，委派注重结果。
    Dispatcher
    
    
# 策略模式
    定义： 策略模式（Strategy Pattern）是指定义了算法家族、分别封 装起来，
          让它们之间可以互相替换，此模式让算法的变化不会 影响到使用算法的用户。 
          可以避免多重分支的if...else...和switch语句
    应用场景： 很多类，做同样的事，但中间的过程不一样
    
    优点：解决大量 if else, 可读性高，优雅，中间算法封装起来了
    缺点：调用方需要知道所有策略，类多了

# 模板模式
    定义： 顶级抽象类定义一系列固定步骤，具体步骤可以交由子类实现，固定不变的交由父类实现
    
    优点：提高复用性，良好扩展性
    缺点：父类增加抽象方法，所有子类得实现一遍
    
    思考：模板模式除了继承以外，还有哪些实现方式？
    继承能做到的，接口方式也能实现，实现类个性化实现或者空实现
    
# 适配器模式
    定义： 兼容不同接口，结构型模式
    适配器适用于以下几种业务场景： 
         1、已经存在的类，它的方法和需求不匹配（方法结果相同或相似）的情况。
         2、适配器模式不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不 同厂家造成功能类似而接口不相同情况下的解决方案。有点亡羊补牢的感觉。
    
    优点： 
        1、能提高类的透明性和复用，现有的类复用但不需要改变。 
        2、目标类和适配器类解耦，提高程序的扩展性。 
        3、在很多业务场景中符合开闭原则。 
    缺点： 
        1、适配器编写过程需要全面考虑，可能会增加系统的复杂性。 
        2、增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。
        
# 观察者模式
    观察者模式（Observer Pattern）定义了对象之间的一对多依赖，让多个观察者对象同 时监听一个主体对象，
    当主体对象发生变化时，它的所有依赖者（观察者）都会收到通 知并更新，属于行为型模式。
    
    应用场景：消息通知
    
    优点： 
         1、观察者和被观察者之间建立了一个抽象的耦合。 
         2、观察者模式支持广播通信。 
    缺点： 
         1、观察者之间有过多的细节依赖、提高时间消耗及程序的复杂度。 
         2、使用要得当，要避免循环调用。
    

      
# 装饰者模式
    装饰者模式（Decorator Pattern）是指在不改变原有对象的基础之上，
    将功能附加到对 象上，提供了比继承更有弹性的替代方案（扩展原有对象的功能），属于结构型模式。
    
   
                   装饰者模式                                            适配器模式
    形式     是一种非常特别的适配器模式                        没有层级关系，装饰器模式有层级关系
    
    定义     装饰者和被装饰者都实现同一个接 口，                适配器和被适配者没有必然的联系，
           主要目的是为了扩展之后依旧保 留 OOP 关系            通常是采用继承或代理的形式进行包装
           
    关系     满足 is-a 的关系                                     满足 has-a 的关系
    
    功能      注重覆盖、扩展                                       注重兼容、转换
    
    设计       前置考虑                                            后置考虑
                         


