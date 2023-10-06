import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        Pizza margheritaPizza = new MargheritaPizza();
        System.out.println(margheritaPizza.getDecoration() + " $ cost " + margheritaPizza.cost() );

        Pizza cheesePizza = new CheeseDecorator(margheritaPizza);
        System.out.println(cheesePizza.getDecoration() + " $ cost " + cheesePizza.cost());

        String sql = "select * from mah where robin";
        // String modifiedSql = sql.split("Where").join(" and pur.warehouseOid = "+request.getBody().getWarehouseOid());
        String modifiedSql = sql.replace("where", "where id = 5");

        System.out.println(modifiedSql);


    }
}
