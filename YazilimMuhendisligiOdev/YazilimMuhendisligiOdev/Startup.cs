using Microsoft.Owin;
using Owin;
using System.Web;
using XSockets.Core.Common.Socket;
using YazilimMuhendisligiOdev;

[assembly: PreApplicationStartMethod(typeof(Startup), "Start")]
[assembly: OwinStartupAttribute(typeof(YazilimMuhendisligiOdev.Startup))]
namespace YazilimMuhendisligiOdev
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
           ConfigureAuth(app);
        }
        private static IXSocketServerContainer _container;
        public static void Start()
        {
            _container = XSockets.Plugin.Framework.Composable.GetExport<IXSocketServerContainer>();
            _container.Start();
        }
    }
}
