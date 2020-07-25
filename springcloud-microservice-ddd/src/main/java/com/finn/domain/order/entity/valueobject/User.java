package name.finn.domain.order.entity.valueobject;

/**
 * @Author jiangyunxiong
 * @Date 2020/7/26 1:54 AM
 */
public class User {

    private Long userId;
    private String username;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
