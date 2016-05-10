﻿using System;

namespace YazilimMuhendisligiOdev.RealtimeControllers.Models
{
    public class StreamModel : IStreamModel
    {
        public Guid Sender { get; set; }
        public string StreamId { get; set; }
        public string Description { get; set; }
    }
}