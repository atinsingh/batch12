package co.pragra.dd.framework.data;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.testng.annotations.DataProvider;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilloBasedProvider {

    @DataProvider
    public Iterator<Object[]> filloProvider(){
        Path path = Paths.get("testdata","Demo.xlsx");

        List<Object[]> data = new ArrayList<>();

        Fillo fillo = new Fillo();
        try {
            Connection connection = fillo.getConnection(path.toString());
            String sql = "SELECT ATIN, VIVEK FROM DEMO";
            Recordset recordset = connection.executeQuery(sql);

            while (recordset.next()){
                List<Object> colData = new ArrayList<>();
                colData.add(recordset.getField(0).value());
                colData.add(recordset.getField(1).value());
                data.add(colData.toArray());
            }


        }catch (FilloException ex){
            ex.printStackTrace();
        }
        return data.iterator();
    }
}
