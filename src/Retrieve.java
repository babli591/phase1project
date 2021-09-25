import java.sql.*;
import java.util.Scanner;



    public class Retrieve {


        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Connection con = DBUtil.getConnection();
            Statement st = con.createStatement(); //st is used for queries
            String sql ="insert into product_list values('pedigree',1320, '13th december')";
            int i = st.executeUpdate(sql);
            if (i > 0) {
                System.out.println("Successfully inserted");
            } else {
                System.out.println("not inserted");
            }


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the product name");
            String prod_name = sc.next();

            String sql2 = "call retrieveproducts(?)";
            CallableStatement ps = con.prepareCall(sql2);
            ps.setString(1, prod_name);

//        String sql2="select * from product_list";
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3));
            }

            st.close();
            con.close();

        }
    }
