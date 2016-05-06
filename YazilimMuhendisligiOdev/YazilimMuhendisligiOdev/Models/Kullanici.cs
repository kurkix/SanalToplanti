using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace YazilimMuhendisligiOdev.Models
{
    public class Kullanici
    {
        public int KullaniciID { get; set; }
        public string Isim { get; set; }
        public string Soyisim { get; set; }
        public string Email { get; set; }
        public string KullaniciAdi { get; set; }

        public string Sifre { get; set; }
    }
}