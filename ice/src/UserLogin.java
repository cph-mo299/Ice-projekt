import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class UserLogin {
    private DOMUtils document;
    int login = DOMUtils.createElement('div');
    login.innerHTML = 'public void login(String username, String password) {';
document.body.appendChild(login);
     login2 = document.createElement('div');
    login2.innerHTML = 'if (username.equals("admin") && password.equals("admin")) {';
document.body.appendChild(login2);
    int login3 = DOMUtils.createElement('div');
    login3.innerHTML = 'System.out.println("Login Successful");';
document.body.appendChild(login3);
    int login4 = DOMUtils.createElement('div');
    login4.innerHTML = '} else {';
document.body.appendChild(login4);
    int login5 = DOMUtils.createElement('div');
    login5.innerHTML = 'System.out.println("Login Failed");';
document.body.appendChild(login5);
    int login6 = DOMUtils.createElement('div');
    login6.innerHTML = '}';
document.body.appendChild(login6);
    int login7 = DOMUtils.createElement('div');
    login7.innerHTML = '}';
document.body.appendChild(login7);
}
