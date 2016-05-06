using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace YazilimMuhendisligiOdev.Models
{
    public class Oda
    {
        public int OdaID { get; set; }
        public string Odaİsmi { get; set; }
        ICollection<Kullanici> Kullanicilar { get; set; }
    }
}