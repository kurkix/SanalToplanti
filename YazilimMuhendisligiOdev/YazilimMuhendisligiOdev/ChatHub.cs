using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Microsoft.AspNet.SignalR;

namespace YazilimMuhendisligiOdev
{
    public class ChatHub : Hub
    {
        public void Hello()
        {
            Clients.All.hello();
        }

        public void Send(string username, string message)
        {
            Clients.All.sendMessage(username, message);

        }
    }
}