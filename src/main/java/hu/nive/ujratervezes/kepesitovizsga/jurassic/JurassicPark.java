package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> checkOverpopulation() {
        try (ResultSet rs = dataSource.getConnection()
                .createStatement()
                .executeQuery("select breed from dinosaur where actual > expected")) {
            return getOrderedNamesFromResultSet(rs);
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Can not connect", sqle);
        }
    }

    private List<String> getOrderedNamesFromResultSet(ResultSet rs) throws SQLException{
        List<String> names = new ArrayList<>();
        while (rs.next()) {
            names.add(rs.getString("breed"));
        }
        names.sort(Comparator.naturalOrder());
        return names;
    }
}

