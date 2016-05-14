using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace YazilimMuhendisligiOdev.Models
{
    public class Kullanici
    {
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int KullaniciID { get; set; }
        public string KullaniciAdi { get; set; }
        public string KullaniciRol { get; set; }
        public string OdaId { get; set; }
    }
}