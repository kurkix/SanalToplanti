﻿using System;

namespace YazilimMuhendisligiOdev.RealtimeControllers.Models
{
    public interface ISignalingModel
    {
        string Message { get; set; }
        Guid Recipient { get; set; }
        Guid Sender { get; set; }
    }
}