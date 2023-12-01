package com.jyd.desig_pattern_demo.by_xfg_case.builder;


import com.jyd.desig_pattern_demo.by_xfg_case.builder.ceiling.LevelOneCeiling;
import com.jyd.desig_pattern_demo.by_xfg_case.builder.ceiling.LevelTwoCeiling;
import com.jyd.desig_pattern_demo.by_xfg_case.builder.coat.DuluxCoat;
import com.jyd.desig_pattern_demo.by_xfg_case.builder.coat.LiBangCoat;
import com.jyd.desig_pattern_demo.by_xfg_case.builder.floor.ShengXiangFloor;
import com.jyd.desig_pattern_demo.by_xfg_case.builder.tile.DongPengTile;
import com.jyd.desig_pattern_demo.by_xfg_case.builder.tile.MarcoPoloTile;

/**
 * 通过上面对建造者模式的使用，已经可以摸索出一点心得。那就是什么时候会选择这样的设计模式，
 * 当：一些基本物料不会变，而其组合经常变化的时候，就可以选择这样的设计模式来构建代码。
 * 此设计模式满足了单一职责原则以及可复用的技术、建造者独立、易扩展、便于控制细节风险。
 * 但同时当出现特别多的物料以及很多的组合后，类的不断扩展也会造成难以维护的问题。
 * 但这种设计结构模型可以把重复的内容抽象到数据库中，按照需要配置。这样就可以减少代码中大量的重复。
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

}