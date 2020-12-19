# LetCode 核心开发类库

这里是一些基础开发类库，请根据需要导入相应的模块。

为了避免与实际项目中依赖的组件发生版本冲突，这里的所有模块均不传递依赖。如果你在使用过程中出现缺少组件依赖的错误，请参照各模块的依赖手动将其导入。

## 【lc-core-commons】公共模块

基础的通用功能组件。

## 【lc-core-web】WEB模块

基于MVC模式的基础开发框架，提供了Controller、Service、Dao的抽象父类。子类只需要继承相应的父类，即可完整的拥有CRUD功能，效率极高。

配合 [**代码生成器**](https://github.com/letcode-net/lc-code-tools)，可以方便地、批量地进行生成基础代码。大大提高开发效率，节省您的宝贵时间。

