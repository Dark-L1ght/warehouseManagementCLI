public class Employee extends Person {
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void login() {
        System.out.println("Karyawan dengan ID " + getUserId() + " telah login.");
    }

    @Override
    public void logout() {
        System.out.println("Karyawan dengan ID " + getUserId() + " telah logout.");
    }

    public void manageEmployee() {
        System.out.println("Karyawan dengan peran " + getRole() + " sedang mengelola stok barang.");
    }
}
