package app.computer_school.mappers;

import app.computer_school.models.User;
import app.computer_school.system.database.IModelMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements IModelMapper<User> {
    @Override
    public User fromResultSet(ResultSet rs) throws SQLException {

        User user= new User();
        user.setId(rs.getLong("id"));
        user.setFirstname(rs.getString("Firstname"));
        user.setLastname(rs.getString("Lastname"));
        user.setMiddlename(rs.getString("midlName"));
        user.setBitrthDate(rs.getString("Birth_Date"));
        user.setPhone(rs.getString("Phone"));
        user.setEmail(rs.getString("Email"));
        return user;
    }

    @Override
    public Object[] toValuesArray(User model) {
        return new Object[]{
                model.getId(),
                model.getFirstname(),
                model.getMiddlename(),
                model.getLastname(),
                model.getBitrthDate(),
                model.getPhone(),
                model.getEmail()
        };


    }
    @Override
    public String[] getColumnNames() {
        return new String[0];
    }

    @Override
    public String getTableName() {
        return "";
    }

    @Override
    public String getIdColumn() {
        return "";
    }

    @Override
    public Object getIdValue(User model) {
        return null;

    }

    @Override
    public void setIdValue(User model, Object id) {
        model.setId(new Long ((long)id));
    }
}
