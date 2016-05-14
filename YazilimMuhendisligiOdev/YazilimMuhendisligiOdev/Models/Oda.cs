using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace YazilimMuhendisligiOdev.Models
{
    public class Oda
    {
        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public string OdaID { get; set; }
        public string Odaismi { get; set; }
        public int KullaniciSayisi { get; set; }
    }
}