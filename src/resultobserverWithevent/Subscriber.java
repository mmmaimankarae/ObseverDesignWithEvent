/* Kitthanya Teachanontkullawat (Mine) 64050027
 * Use EventObject of Java */
package resultobserverWithevent;

/*
 * @author mmmaimankarae
 */
public class Subscriber implements ScoreListener {
    /* ต้องการให้แสดงผลล่าสุดยังไง */
    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("live result: " + evt.getScoreLine());
    }
}
