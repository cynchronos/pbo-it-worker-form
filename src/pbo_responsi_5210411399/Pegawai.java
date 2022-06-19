package pbo_responsi_5210411399;

public class Pegawai {

    private String nama_pgw;
    private String no_pgw;
    private String posisi_pgw;
    private String gaji_pgw;

    public Pegawai() {
    }

    public Pegawai(String nama_pgw, String no_pgw, String posisi_pgw, String gaji_pgw) {
        this.nama_pgw = nama_pgw;
        this.no_pgw = no_pgw;
        this.posisi_pgw = posisi_pgw;
        this.gaji_pgw = gaji_pgw;
    }

    public void setNama_pgw(String nama_pgw) {
        this.nama_pgw = nama_pgw;
    }

    public void setNo_pgw(String no_pgw) {
        this.no_pgw = no_pgw;
    }

    public void setPosisi_pgw(String posiss_pgw) {
        this.posisi_pgw = posiss_pgw;
    }

    public void setGaji_pgw(String gaji_pgw) {
        this.gaji_pgw = gaji_pgw;
    }

    public String getNama_pgw() {
        return nama_pgw;
    }

    public String getNo_pgw() {
        return no_pgw;
    }

    public String getPosisi_pgw() {
        return posisi_pgw;
    }

    public String getGaji_pgw() {
        return gaji_pgw;
    }

    public String cetakInfoPegawai() {
        StringBuilder sb = new StringBuilder();
        sb.append("================ INFORMASI DATA PEGAWAI ================");
        sb.append("\nNama \t\t : ").append(getNama_pgw());
        sb.append("\nNo Pegawai \t\t : ").append(getNo_pgw());
        sb.append("\nPosisi/Jabatan \t\t : ").append(getPosisi_pgw());
        sb.append("\nGaji \t\t : ").append(getGaji_pgw());
        sb.append("\n\n");
        
        return sb.toString();
    }
}
