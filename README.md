# java-learning

Java 学习日志。起点 2026-09-16，目标是 **2027 春招拿到游戏公司后端 offer**。

完整计划见 **[ROADMAP.md](ROADMAP.md)** —— 五个阶段、技术栈、里程碑和验收标准都在里面。

## 当前进度

**阶段 1：Java SE 地基**（9/17 - 11/5）—— 跟黑马课程，重写面向对象，目标是独立写出一个能玩的单机小游戏。

| 里程碑 | 状态 |
|---|---|
| 学生管理系统（控制台） | ⬜ |
| 图书管理系统（控制台） | ⬜ |
| **贪吃蛇**（图形版） | ⬜ |
| 联机游戏项目 | 12 月开启 |

## 目录结构

```
src/
├── HelloWorld.java          第一个程序
├── oop/                     面向对象练习
│   ├── phone/               继承入门：手机迭代
│   ├── differentclassroom/  继承 + 封装：人 / 学生 / 老师
│   ├── instrument/          继承 + 方法重写
│   ├── calculateprice/      继承综合：智能设备价格计算
│   ├── restaurantemploy/    继承：员工 / 厨师 / 经理（构造器链 + work 重写）
│   └── synthesize/          继承综合：学生 / 教师四种角色
├── polymorphic/             多态练习
│   ├── abstracttest/        抽象类 + 抽象方法
│   ├── calculategraph/      图形求面积周长（抽象父类 + 多态调用）
│   ├── petmanager/          主人喂养宠物
│   ├── usevehicle/          人的出行方式（子类独有方法才用 instanceof）
│   ├── studentmanager/      学生 / 老师 / 管理员共用 work 重写
│   └── shapev2/             图形系统 v2（抽象父类 + 静态计数器 + 调用方 instanceof）
├── interfacetest/           接口练习
│   ├── test1/               动物会游泳（接口版多态：Swim[] 装着狗和青蛙）
│   ├── test2/               运动员 / 教练说英语（能力跨类族）
│   └── hero/                英雄与技能：治疗 / 对话 / 沉默（契约在接口，状态在类）
├── innertest/               内部类练习
│   ├── battle/              战斗系统：四个匿名内部类 + 接口回调（账要对得上）
│   ├── test/                捕获机制对照（Fake / FakeArr）
│   └── innerdemo/           三种内部类对照（成员 / 静态 / 局部）
├── enumtest/                枚举练习
│   ├── classvideo/          跟课：订单状态（带参常量 + values / valueOf）
│   ├── equip/               装备品质：带数据枚举 + 颜色两条路线（数据 / 抽象方法）
│   └── state/               玩家状态机：switch 判据 + 状态转移
├── genericity/              泛型练习
│   ├── loot/                通用背包 Backpack<T> + 搬运 LootUtil（泛型类 / 泛型方法）
│   ├── filter/              战利品筛选：泛型接口 + 通配符（? super 递规则 / ? extends 读数）
│   └── Backpack.java        闭卷重写存档：5 分钟凭记忆写的最小泛型类（2026-10-15）
└── api/                     常用 API 练习
    ├── profile/             玩家名片清洗：split / trim / parseInt
    ├── battlelog/           战斗日志：StringBuilder + deleteCharAt + reverse
    ├── date/                日期：LocalDate / isEqual / plusDays
    └── palindrome/          闭卷重写：回文判定（StringBuilder.reverse）

docs/
├── 2026-09-19-多态练习-图形系统v2.md    多态练习：题目 + 批改记录
├── 2026-09-21-接口练习-英雄与沉默.md    接口练习：题目 + 批改记录
├── 2026-09-22-内部类练习-一次性武器.md  内部类：题目 + 批改 + 复健 + 收官
├── 2026-10-12-枚举练习-装备品质与状态机.md  枚举：题目 + 批改 + 收官
├── 2026-10-13-泛型练习-通用背包与战利品筛选.md  泛型：题目 + 批改 + 收官（含报错存档 / 概念题 / 闭卷评估）
└── 2026-10-15-常用API练习-玩家名片与战斗日志.md  常用 API：题目 + 批改 + 收官（含报错存档 / 概念题）
```

> 进度：继承、多态、抽象类、接口、内部类、枚举、泛型、常用 API 均已完成 —— 常用 API 这轮最硬的一条是「String 的修改方法必须接返回值」；四道题输出与验收逐字一致，闭卷回文存档在 `api/palindrome/`。
> 下一步：集合（10/18 开，面试第一考点区）。

每个包都是**亲手敲的**，跟着教程敲的不算。

## 提交纪律

工作日 3 小时、周末 6 小时，**每天至少一次提交**。

> 那个绿格子不是形式主义。连续半年每天提交，是应届生简历上最便宜也最有力的信号之一。
