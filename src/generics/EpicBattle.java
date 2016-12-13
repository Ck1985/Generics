package generics;

/**
 * Created by Dell Vostro 5459 on 12/13/2016.
 */
import java.util.*;

interface SuperPower{}
interface XRayVision extends SuperPower{
    void seeThrowWalls();
}
interface SuperHearing extends SuperPower{
    void hearSubtleNoises();
}
interface SuperSmell extends SuperPower{
    void trackBySmell();
}
class SuperHero<POWER extends SuperPower>{
    POWER power;
    SuperHero(POWER power){
        this.power = power;
    }
    POWER getPower(){
        return this.power;
    }
}
class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{
    SuperSleuth(POWER power){
        super(power);
    }
    void see(){
        power.seeThrowWalls();
    }
}
class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{
    CanineHero(POWER power){
        super(power);
    }
    void hear(){
        power.hearSubtleNoises();
    }
    void smell(){
        power.trackBySmell();
    }
}
class SuperHearSmell implements SuperHearing, SuperSmell{
    public void hearSubtleNoises(){}
    public void trackBySmell(){}
}
class DogBoy extends CanineHero<SuperHearSmell>{
    DogBoy(){
        super(new SuperHearSmell());
    }
}
public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
    }
    static <POWER extends SuperHearing & SuperSmell> void useSuperFind(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }
    public static void main(String[] args){
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        useSuperFind(dogBoy);
        //You can do thid:
        List<? extends SuperHearing> audioBoys;
        // But you can not do this:
        // List<? extends SuperHearing & SuperSmell> dogBoys;
    }
}
