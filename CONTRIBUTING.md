# How to add a sample

- Create a sample files inside `com.haulmont.sampler.web.ui` package of _web module_. 

    Required files are:
    - XML descriptor
    - HTML files with localized descriptions and name pattern: `<xml_descriptor_name>-<locale_code>.html`
  
    Optional files are:
    - Controller class
    - Additional files like scss styles, html templates, etc.
  
> Every sample has its own directory and all samples are structured logically. For example:
button samples are placed inside the `com.haulmont.sampler.web.ui.components.button.*` package, 
where `components` - base package for all GUI components samples and `button` - base package for button samples. 
If a certain component has only one sample, then it can be placed in a base package for this component. 
For example: `com.haulmont.sampler.web.ui.components.bulkeditor`.

- Add a descriptor to `web-samples-menu.xml` inside a proper submenu. 

    Required _item_ attributes:
    - `id` - equals to sample xml file name. For example: `id="simple-button"`.
    - `descriptionPack` - relative path to a sample directory. Used to find description files. 
    For example: `descriptionsPack="com/haulmont/sampler/web/ui/components/button/simple"`.
    
    Highly recommended:
    - `sampleHeight` - an integer number defining height of the sample area. Can be set in pixel or as a percentage. 
    Used in cases then `splitEnabled="true"`. 
    - `docUrlSuffix` - used to create link to the documentation.
    
    Optional attributes and elements:
    - `controller` - relative path to a sample controller class file. For example: 
    `controller="com/haulmont/sampler/web/ui/components/button/simple/SimpleButtonFrame.java"`.
    - `splitEnabled` - controls whether or not split is used to separate a sample and its description. 
    Default value is `false`.
    - `otherFiles` - contains nested `file` elements, where `name` attribute is a relative path to a additional files. 
    For example: 
    ```
    <otherFiles>
        <file name="com/haulmont/sampler/entity/Customer.java"/>
    </otherFiles>
    ```

> All samples (in most cases) roots have a natural sort order. Menus, submenus and items equal to the package structure. 
For example, button samples have submenu `buttons`, but `bulkeditor` only the item.

- Add a localized values for samples menu items and submenus in `message.properties` files located 
in `com.haulmont.sampler.web` package.

# Code style and samples rules

- Use less code as possible. For example, remove unnecessary calls of empty _super_ methods 
(`super.init(params)`, etc.).
- All XML files must be formatted by CUBA Studio. For example, Studio places component attributes in 
natural sort order and one attribute per line.
- If some sample menu item (or submenu) doesn't need to be localized for some language, 
do not add a localized key for that language.
- Use percentage split size only for _big_ components like table or chart, which can be resized 
according to sample frame size. For other cases set split size in pixels.
- Documentation links must refer to the multipage documentation.
- All files used for a sample must be included in menu item definition. For example: 
    - Screen controller class.
    - Entity classes, even if an entity is used only for a table column and not a primary datasource entity.
    - Other screen descriptors
    - SCSS styles
    - HTML templates
    - etc.
- Place sample data to `30.create-db.sql` if a sample uses a datasource. Usage of `AbstractNotPersistentEntity` 
inheritors and other ways of adding data programmatically allowed only if sample shows they usage as its main goal.
- If a sample needs to modify an entity, then add permissions to edit this entity for the `demo` user and place 
corresponding SQL scripts to `30.create-db.sql`.
- Please pay attention that most files like `web-screens.xml`, `30.create-db.sql`, `web-samples-menu.xml`, 
`message.properties`, etc. follow logical structuring rules.

# Major and Minor Platform version update

Do not forget to update doc links:

- `docUrl` in _main_ message pack
- `docUrl` in `com.haulmont.sampler.web.ui.charts` package
- all links in description files (.html)