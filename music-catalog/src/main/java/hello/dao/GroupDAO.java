package hello.dao;

import hello.Group;
import org.springframework.jdbc.core.JdbcTemplate;

public class GroupDAO {
    private JdbcTemplate jdbcTemplate;

    public GroupDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addGroup(Group group) {
        String sql = "insert into groups values (?, ?, ?)";
        jdbcTemplate.update(sql, group.getId(), group.getName(), group.getInfo());
    }

    public Group showGroups() {
        return jdbcTemplate.queryForObject(
                "select * from groups",
                new GroupRowMapper()
        );
    }
}