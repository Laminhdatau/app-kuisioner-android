package id.ac.poligon.kuisioner_app.Model;

import java.util.List;

public class MainModel {
    private List<DataKuis> data;
    public List<DataKuis> getData() {
        return data;
    }

    public void setData(List<DataKuis> data) {
        this.data = data;
    }


    public class DataKuis{
        private String kd_quisioner;
        private String quisioner;
        private int id_jenis_quisioner;
        private int status;
        private String created_up;

        public String getKd_quisioner() {
            return kd_quisioner;
        }

        public void setKd_quisioner(String kd_quisioner) {
            this.kd_quisioner = kd_quisioner;
        }

        public String getQuisioner() {
            return quisioner;
        }

        public void setQuisioner(String quisioner) {
            this.quisioner = quisioner;
        }

        public int getId_jenis_quisioner() {
            return id_jenis_quisioner;
        }

        public void setId_jenis_quisioner(int id_jenis_quisioner) {
            this.id_jenis_quisioner = id_jenis_quisioner;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCreated_up() {
            return created_up;
        }

        public void setCreated_up(String created_up) {
            this.created_up = created_up;
        }

        @Override
        public String toString() {
            return "DataKuis{" +
                    "kd_quisioner='" + kd_quisioner + '\'' +
                    ", quisioner='" + quisioner + '\'' +
                    ", id_jenis_quisioner=" + id_jenis_quisioner +
                    ", status=" + status +
                    ", created_up='" + created_up + '\'' +
                    '}';
        }
    }
}
