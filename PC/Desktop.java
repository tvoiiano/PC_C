public class Desktop extends PCFisso{
    private String schedaVideo;
    private String schedaAudio;
    
    public Desktop(String processore, int ram, int memoria, String marca, String modello, String so, String tipocase,
            String schedaVideo, String schedaAudio) {
        super(processore, ram, memoria, marca, modello, so, tipocase);
        this.schedaVideo = schedaVideo;
        this.schedaAudio = schedaAudio;
    }

    public String getSchedaVideo() {
        return schedaVideo;
    }

    public void setSchedaVideo(String schedaVideo) {
        this.schedaVideo = schedaVideo;
    }

    public String getSchedaAudio() {
        return schedaAudio;
    }

    public void setSchedaAudio(String schedaAudio) {
        this.schedaAudio = schedaAudio;
    }

    public String toString() {
        String s = "";

        s = super.toString();
        s += "Tipo di scheda video: " + schedaVideo + "\nTipo di scheda audio: " + schedaAudio + "\n";
        
        return s;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Desktop other = (Desktop) obj;
        if (schedaVideo == null) {
            if (other.schedaVideo != null)
                return false;
        } else if (!schedaVideo.equals(other.schedaVideo))
            return false;
        if (schedaAudio == null) {
            if (other.schedaAudio != null)
                return false;
        } else if (!schedaAudio.equals(other.schedaAudio))
            return false;
        return true;
    }
}
