import { platformBrowser } from '@angular/platform-browser';
import { ProdConfig } from './blocks/config/prod.config';
import { HendoscoreAppModuleNgFactory } from '../../../../build/aot/src/main/webapp/app/app.module.ngfactory';

ProdConfig();

platformBrowser().bootstrapModuleFactory(HendoscoreAppModuleNgFactory)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
