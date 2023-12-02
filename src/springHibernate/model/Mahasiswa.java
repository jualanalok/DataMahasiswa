/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import static jdk.nashorn.internal.runtime.Debug.id;

@Entity
@Table (name = "tb_mahasiswa")
public class Mahasiswa {
    @Id 
    @Column(name = "npm", length = 0)
    private String npm;
    
    @Column(name = "nama", length = 50)
    private String nama;
    
    @Column(name = "kelas", length = 10)
    private String kelas;
    
    @Column(name = "alamat", length = 150)
    private String alamat;
    
    public String getNPM() {return npm;}
    public void setNPM(String npm) { this.npm = npm; }
    
    public String getNama() {return nama;}
    public void setNama(String nama) { this.nama = nama; }
    
    public String getKelas() {return kelas;}
    public void setKelas(String kelas) { this.npm = kelas; }
    
    public String getAlamat() {return alamat;}
    public void setAlamat(String alamat) { this.alamat = alamat; }
}
