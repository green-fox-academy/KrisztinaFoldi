#pragma checksum "/Users/foldikrisztina/greenfox/rider/first project/caloriesCA/caloriesCA/Views/Food/Index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "0cab0510d0e56b8bfc6c10c847312e081b963607"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Food_Index), @"mvc.1.0.view", @"/Views/Food/Index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Food/Index.cshtml", typeof(AspNetCore.Views_Food_Index))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"0cab0510d0e56b8bfc6c10c847312e081b963607", @"/Views/Food/Index.cshtml")]
    public class Views_Food_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<List<caloriesCA.Models.Food>>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(36, 137, true);
            WriteLiteral("<h1>Calorie counter</h1>\n\n<table class=\"table\">\n    <tr>\n        <th>Name</th>\n        <th>Amount</th>\n        <th>Action</th>\n    </tr>\n");
            EndContext();
#line 10 "/Users/foldikrisztina/greenfox/rider/first project/caloriesCA/caloriesCA/Views/Food/Index.cshtml"
     foreach (var food in Model)
    {

#line default
#line hidden
            BeginContext(212, 29, true);
            WriteLiteral("        <tr>\n            <td>");
            EndContext();
            BeginContext(242, 9, false);
#line 13 "/Users/foldikrisztina/greenfox/rider/first project/caloriesCA/caloriesCA/Views/Food/Index.cshtml"
           Write(food.Name);

#line default
#line hidden
            EndContext();
            BeginContext(251, 22, true);
            WriteLiteral("</td>\n            <td>");
            EndContext();
            BeginContext(274, 11, false);
#line 14 "/Users/foldikrisztina/greenfox/rider/first project/caloriesCA/caloriesCA/Views/Food/Index.cshtml"
           Write(food.Amount);

#line default
#line hidden
            EndContext();
            BeginContext(285, 44, true);
            WriteLiteral("</td>\n            <td>\n                <form");
            EndContext();
            BeginWriteAttribute("action", " action=\"", 329, "\"", 366, 2);
            WriteAttributeValue("", 338, "/Food/Delete?id=", 338, 16, true);
#line 16 "/Users/foldikrisztina/greenfox/rider/first project/caloriesCA/caloriesCA/Views/Food/Index.cshtml"
WriteAttributeValue("", 354, food.FoodId, 354, 12, false);

#line default
#line hidden
            EndWriteAttribute();
            BeginContext(367, 153, true);
            WriteLiteral(" method=\"post\">\n                    <button type=\"submit\" class=\"btn btn-danger\">Delete</button>\n                </form>\n            </td>\n        </tr>\n");
            EndContext();
#line 21 "/Users/foldikrisztina/greenfox/rider/first project/caloriesCA/caloriesCA/Views/Food/Index.cshtml"
    }

#line default
#line hidden
            BeginContext(526, 450, true);
            WriteLiteral(@"</table>
<h2>Add a new food</h2>
<form action=""/Food/Add"" method=""post"">
    <div class=""form-group"">
        <label for=""name"">Name</label>
        <input type=""text"" name=""name"" value="""" class=""form-control""/>
    </div>
    <div class=""form-group"">
        <label for=""amount"">Amount</label>
        <input type=""text"" name=""amount"" value="""" class=""form-control""/>
    </div>
    <button type=""submit"" class=""btn btn-primary"">Add</button>
</form>
");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<List<caloriesCA.Models.Food>> Html { get; private set; }
    }
}
#pragma warning restore 1591